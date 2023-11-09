import os
import subprocess
import sys
import time


import argparse

import re
import templates
import glob
import os
import glob
import subprocess

#######################
# Tokens
#######################

# Keywords
CLASS = 'CLASS'
PUBLIC = 'PUBLIC'
PRIVATE = 'PRIVATE'
STATIC = 'STATIC'
VOID = 'VOID'
IF = 'IF'
ELSE = 'ELSE'
FOR = 'FOR'
WHILE = 'WHILE'
RETURN = 'RETURN'
INT = 'INT'
STRING = 'STRING'
BOOL = 'BOOL'
TRUE = 'TRUE'
FALSE = 'FALSE'
NULL = 'NULL'
# Operators
PLUS = 'PLUS'
MINUS = 'MINUS'
MULTIPLY = 'MULTIPLY'
DIVIDE = 'DIVIDE'
MODULO = 'MODULO'
EQUALS = 'EQUALS'
NOT_EQUALS = 'NOT_EQUALS'
LESS_THAN = 'LESS_THAN'
GREATER_THAN = 'GREATER_THAN'
LESS_THAN_EQUALS = 'LESS_THAN_EQUALS'
GREATER_THAN_EQUALS = 'GREATER_THAN_EQUALS'
ASSIGNMENT = 'ASSIGNMENT'
INCREMENT = 'INCREMENT'
DECREMENT = 'DECREMENT'
# Delimiters
LEFT_PARENTHESIS = 'LEFT_PARENTHESIS'
RIGHT_PARENTHESIS = 'RIGHT_PARENTHESIS'
LEFT_BRACE = 'LEFT_BRACE'
RIGHT_BRACE = 'RIGHT_BRACE'
LEFT_BRACKET = 'LEFT_BRACKET'
RIGHT_BRACKET = "RIGHT_BRACKET"
SEMICOLON = 'SEMICOLON'
COMMA = 'COMMA'
# Types
VAR = 'VAR'
STRING = 'STRING'
INT = 'INT'
FLOAT = 'FLOAT'
BOOL = 'BOOL'
# Keywords
KEYWORDS = [
    'STRUCT',
    'REVOID',
    'RESTRING',
    'REINT',
    'PUBTASK',
    'REHOUSE',
    'REFLOAT',
    'REBOOL',
    'INT',
    'HOUSE',
    'FLOAT',
    'BOOL',
    'IF',
    'ELSE',
    'ROOM',
    'WHILE',
    'FOR',
    'VOID',
    'RETURN',
    'CONTINUE',
    'TRUE',
    'FALSE',
    'EMPTY',
]

# Literals
IDENTIFIER = 'IDENTIFIER'
INTEGER_LITERAL = 'INTEGER_LITERAL'
STRING_LITERAL = 'STRING_LITERAL'
# End of file
EOF = 'EOF'


#######################################
# CONSTANTS
#######################################

DIGITS = '0123456789'

#######################################
# ERRORS
#######################################

class Error:
    def __init__(self, pos_start, pos_end, error_name, details):
        self.pos_start = pos_start
        self.pos_end = pos_end
        self.error_name = error_name
        self.details = details
    
    def as_string(self):
        result  = f'{self.error_name}: {self.details}\n'
        result += f'File {self.pos_start.fn}, line {self.pos_start.ln + 1}'
        return result

class IllegalCharError(Error):
    def __init__(self, pos_start, pos_end, details):
        super().__init__(pos_start, pos_end, 'Illegal Character', details)

#######################################
# POSITION
#######################################

class Position:
    def __init__(self, idx, ln, col, fn, ftxt):
        self.idx = idx
        self.ln = ln
        self.col = col
        self.fn = fn
        self.ftxt = ftxt

    def advance(self, current_char):
        self.idx += 1
        self.col += 1

        if current_char == '\n':
            self.ln += 1
            self.col = 0

        return self

    def copy(self):
        return Position(self.idx, self.ln, self.col, self.fn, self.ftxt)

#######################################
# TOKENS
#######################################

class Token:
    def __init__(self, type_, value=None):
        self.type = type_
        self.value = value
    
    def __repr__(self):
        if self.value: return f'{self.type}:{self.value}'
        return f'{self.type}'

#######################################
# LEXER
#######################################

class Lexer:
    def __init__(self, fn, text):
        self.fn = fn
        self.text = text
        self.pos = Position(-1, 0, -1, fn, text)
        self.current_char = None
        self.advance()
    
    def advance(self):
        self.pos.advance(self.current_char)
        self.current_char = self.text[self.pos.idx] if self.pos.idx < len(self.text) else None

    def make_tokens(self):
        tokens = []

        while self.current_char != None:
            if self.current_char in ' \t':
                self.advance()
            elif self.current_char in DIGITS:
                tokens.append(self.make_number())
            elif self.current_char == '+':
                tokens.append(Token(PLUS))
                self.advance()
            elif self.current_char == '-':
                tokens.append(Token(MINUS))
                self.advance()
            elif self.current_char == '*':
                tokens.append(Token(MULTIPLY))
                self.advance()
            elif self.current_char == '/':
                tokens.append(Token(DIVIDE))
                self.advance()
            elif self.current_char == '%':
                tokens.append(Token(MODULO))
                self.advance()
            elif self.current_char == '=':
                tokens.append(Token(EQUALS))
                self.advance()
            elif self.current_char == '"':
                tokens.append(self.make_string())
                self.advance()
            elif self.current_char == '<':
                tokens.append(Token(LESS_THAN))
                self.advance()
            elif self.current_char == '>':
                tokens.append(Token(GREATER_THAN))
                self.advance()
            elif self.current_char == '(':
                tokens.append(Token(LEFT_PARENTHESIS))
                self.advance()
            elif self.current_char == ')':
                tokens.append(Token(RIGHT_PARENTHESIS))
                self.advance()
            elif self.current_char == '{':
                tokens.append(Token(LEFT_BRACE))
                self.advance()
            elif self.current_char == '}':
                tokens.append(Token(RIGHT_BRACE))
                self.advance()
            elif self.current_char == '[':
                tokens.append(Token(LEFT_BRACKET))
                self.advance()
            elif self.current_char == ']':
                tokens.append(Token(RIGHT_BRACKET))
                self.advance()
            elif self.current_char == ';':
                tokens.append(Token(SEMICOLON))
                self.advance()
            elif self.current_char == ',':
                tokens.append(Token(COMMA))
                self.advance()
            elif self.current_char.isalpha() or self.current_char == '_':
                tokens.append(self.make_identifier_or_keyword())
            else:
                pos_start = self.pos.copy()
                char = self.current_char
                self.advance()
                return [], IllegalCharError(pos_start, self.pos, "'" + char + "'")

        return tokens, None
    def make_identifier_or_keyword(self):
        id_str = ''

        while self.current_char != None and (self.current_char.isalpha() or self.current_char == '_'):
            id_str += self.current_char
            self.advance()

        if id_str in KEYWORDS:
            return Token(KEYWORDS, id_str)
        else:
            return Token(IDENTIFIER, id_str)
    def make_number(self):
        num_str = ''
        dot_count = 0

        while self.current_char != None and self.current_char in DIGITS + '.':
            if self.current_char == '.':
                if dot_count == 1: break
                dot_count += 1
                num_str += '.'
            else:
                num_str += self.current_char
            self.advance()

        if dot_count == 0:
            return Token(INT, int(num_str))
        else:
            return Token(FLOAT, float(num_str))
    def make_string(self):
        string = ''
        escape_character = False
        self.advance()

        escape_characters = {
            'n': '\n',
            't': '\t'
        }

        while self.current_char != None and (self.current_char != '"' or escape_character):
            if escape_character:
                string += escape_characters.get(self.current_char, self.current_char)
            else:
                if self.current_char == '\\':
                    escape_character = True
                else:
                    string += self.current_char
            self.advance()
            escape_character = False

        self.advance()
        return Token(STRING, string)
    
    def make_identifier(self):
        id_str = ''

        while self.current_char != None and self.current_char in DIGITS + '_':
            id_str += self.current_char
            self.advance()

        return Token(IDENTIFIER, id_str)
    
    def make_keyword(self, start, stop, text):
        if text in KEYWORDS:
            return Token(text.upper())
        return self.make_identifier()
    
    def make_equals(self):
        
        self.advance()
        return Token(ASSIGNMENT)
    
#######################################
# RUN
#######################################
def tokens_to_string(tokens):
    return ' '.join(token.value for token in tokens if token.type != 'EOF')
def run(fn, text):
    lexer = Lexer(fn, text)
    tokens, error = lexer.make_tokens()


translation_dict = {
    'struct': ('static void'),
    'revoid': ('public static void'),
    'restring': ('public static string'),
    'reint': ('public static int'),
    'pubtask': ('public static async Task'),
    'rehouse': ('public static namespace'),
    'refloat': ('public static float'),
    'rebool': ('public static bool'),
    'int': ('int'),
    'house': (' namespace '),
    'float': (' float '),
    'bool': (' bool '),
    'if': (' if '),
    'else': (' else '),
    'room': ('class'),
    'while': (' while '),
    'for': (' foreach '),
    ' > ': (' in '),
    'void': (' void '),
    'return': (' return '),
    'continue': (' continue '),
    'true': (' true '),
    'false': (' false '),
    'empty': (' null '),
    'this': (' this '),
    'base': (' base '),
    'bland': ('default'),
    'stop': ('break'),
    'at': ('case')

}
def transpile(event):
    """
    Transpiles the given event text using a translation dictionary.

    Args:
    event (str): The text to be transpiled.

    Returns:
    str: The transpiled text.
    """
    lines = event.splitlines()

    translated_lines = []

    # Apply translation line by line based on the dictionary
    for line in lines:

        # Split the line into words and punctuation marks
        words = re.split(r'(\W+)', line)
        translated_words = []

        for word in words: # get the input text
            try:
                # Convert word to lower case
                lower_word = word.lower()
                if lower_word in translation_dict:
                    # Preserve the original case of the word
                    if word[0].isupper():
                        translated_words.append(translation_dict[lower_word].capitalize())
                    else:
                        translated_words.append(translation_dict[lower_word])
                else: #if the word is not in the dictionary
                    translated_words.append(word)
            except Exception as e:
                print(f"Error translating word '{word}': {e}")
                translated_words.append(word)

        translated_line = "".join(translated_words)
        translated_lines.append(translated_line)

    translated_text = "\n".join(translated_lines)
    return translated_text
    

def createoutput(translated_text): # this is for creating files
    file_path = "Program.cs"
    with open(file_path, 'w') as file:
        file.write(translated_text)

def Compilee(file_name): # this is for compiling a file from a list
    file_path = file_name + ".cs"
    
    file_name = file_name + ".cusp"
    
    print(f"Compiling file '{file_name}'...")
    
    print(f"Transpiling file {file_path}")
    
    try:
        with open(file_name, 'r') as file:
            event = file.read()
        
        translated_text = transpile(event)
        
        with open(file_path, 'w') as file:
            file.write(translated_text)
        
        print(f"File written to: {file_path}")
    except Exception as e:
        print(f"Error writing to file: {e}")
        
    print("Compiling...")
  



def Compileproject():
    # Read the project file
    try:
        with open("Project.cspm", 'r') as file:
            filedata = file.readlines()  # readlines instead of read
    except Exception as e:
        print_error(f"Error reading project file: {e}")
        exit()

    # Each line is a file with a .cusp extension. We need to transpile each one of them into a .cs file
    try:
        # Get the name of the .csproj file within the same directory
        current_directory = os.getcwd()

        # Find .csproj files in the current directory
        csproj_files = glob.glob(os.path.join(current_directory, "*.csproj"))

        # Get the first .csproj file name
        if csproj_files:
            csproj_file_name = os.path.basename(csproj_files[0])
            print(f".csproj file found: {csproj_file_name}")
        else:
            print_error("No .csproj file found in the current directory.")
            exit()
    except Exception as e:
        print_error(f"Error finding .csproj file: {e}")
        exit()

    try:
        for line in filedata:
            # Get the file name
            file_name = line.strip()  # Remove newline characters
            print(f"Compiling file '{file_name}'...")

            # Open the file
            Compilee(file_name)

           
            subprocess.run(["dotnet build"], shell=True)
      

            # Remove the .cs file * not available within --compout

    except Exception as e:
        print_error(f"Error compiling file '{file_name}': {e}")
        
    #os.remove(file_name + ".cs")

def Compileprojectwithoutput():
   pass
        




def Runproject(name):
    #read the project file
    with open(name + ".cspm", 'r') as file:
        filedata = file.read()
    # each line is a file with a .cusp extension
    # we need to transpile each one of them into a .cs file==
    
    for line in filedata:
        # get the file name
        file_name = line
        # open the file
        with open(file_name, 'r') as file:
            event = file.read()
        # transpile the file
        translated_text = transpile(event)
        # create the output file
        createoutput(translated_text)
        
    subprocess.run(["dotnet run"])
        
        