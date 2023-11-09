import os
import subprocess
import sys
import time


import argparse

import re
from errors import *
import glob
import os
import glob
import subprocess

#######################
# Tokens
#######################
class TokenType:
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

    # Literals
    IDENTIFIER = 'IDENTIFIER'
    INTEGER_LITERAL = 'INTEGER_LITERAL'
    STRING_LITERAL = 'STRING_LITERAL'

    # End of file
    EOF = 'EOF'


class Token:
    def __init__(self, type_, value):
        self.type = type_
        self.value = value
    
    def __repr__(self): 
        if self.value: return f'{self.type}:{self.value}'
        return f'{self.type}'
class Lexer:
    def __init__(self, text):
        self.text = text
        self.pos = -1
        self.current_char = None
    
    def advance(self):
        self.pos += 1
        self.current_char = self.text[self.pos] if self.pos < len(self.text) else None
    
    def make_tokens(self):
        tokens = []
        while self.current_char != None:
            if self.current_char in '\t':
                self.advance()
            elif self.current_char == '{':
                tokens.append(Token(TokenType.RIGHT_BRACKET))
            elif self.current_char == '}':
                tokens.append(Token(TokenType.LEFT_BRACKET))
            elif self.current_char == '{':
                tokens.append(Token(TokenType.RIGHT_BRACKET))
            elif self.current_char == '{':
                tokens.append(Token(TokenType.RIGHT_BRACKET))
            elif self.current_char == '{':
                tokens.append(Token(TokenType.RIGHT_BRACKET))
            elif self.current_char == '{':
                tokens.append(Token(TokenType.RIGHT_BRACKET))
            elif self.current_char == '{':
                tokens.append(Token(TokenType.RIGHT_BRACKET))
            elif self.current_char == '{':
                tokens.append(Token(TokenType.RIGHT_BRACKET))
            elif self.current_char == '{':
                tokens.append(Token(TokenType.RIGHT_BRACKET))
            elif self.current_char == '{':
                tokens.append(Token(TokenType.RIGHT_BRACKET))
            elif self.current_char == '{':
                tokens.append(Token(TokenType.RIGHT_BRACKET))
            elif self.current_char == '{':
                tokens.append(Token(TokenType.RIGHT_BRACKET))
            elif self.current_char == '{':
                tokens.append(Token(TokenType.RIGHT_BRACKET))
            elif self.current_char == '{':
                tokens.append(Token(TokenType.RIGHT_BRACKET))
            elif self.current_char == '{':
                tokens.append(Token(TokenType.RIGHT_BRACKET))
            
        return tokens

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
    'stop': (' break '),
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

           
            subprocess.run(["dotnet", 'build'], shell=True)
      

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
        
        