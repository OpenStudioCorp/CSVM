import webbrowser
import os
import subprocess
import sys
import time
import transpiler
import templates
import argparse
import re
import json
import requests
import urllib.request
import urllib.parse
import urllib.error
import templates
from colorama import *
from transpiler import *
from templates import *
from versions import *
from templates import *
import ssl

#################
##CubeScript VM##
#################

# made by Charlie-sans
# this is the main file for the CubeScript VM
# other files include
# - errors.py (for errors)
# - templates.py (for templates)
# - transpiler.py (for transpiling)
# - tests.py (for testing) * not included within the final build



Name = "CVSM"


parser = argparse.ArgumentParser(description="CubeScript VM")
parser.add_argument('-t', action='store_true', help='Open the terminal')
parser.add_argument('-r', action='store_true', help='Run the program')
parser.add_argument('-compile', action='store_true', help='Compile the program')
parser.add_argument('-f', action='store_true', help='Force compile the program? why?')

parser.add_argument('-compout', action='store_true', help='Compile the program with output')
parser.add_argument('-ve', action='store_true', help='Version of CSVM')

args = parser.parse_args()
##important stuff##
if args.t:
    open_term_help()
    while True:
        command = input(">>> ")
        if command == "help":
            help()
        elif command == "exit":
            exit()
        else:
            print("Invalid command")
            print("Type 'help' for help")
            continue

if args.ve:
    print("CubeScript CSVM Version:" + __version__)
    exit()
def LinuxMain():
    
    """_summary_
    CubeScript's main function
    designed and tested by Charlie-sans
    
    """
    try:
        
        CheckCSVM()
        
        
        
    except Exception as e:
        
        print_info(f"Error checking for updates: {e}")
        
        print_info("are you connected to the internet?")
        
    
    
    # use checkhomedll to check if the home.dll is in the folder
    
    if CheckFile('Home.dll') == False:
        
        print_error("home.dll not found! Would you like to download it? (y/n)")
        
        download = input(">>> ")
        
        if download == "y":
            
            print("Downloading...")
            
            try:
                
                link = "https://Github.com/charlie-sans/CSVM/raw/main/home.dll"
                
                download_file(link, ".")
                
                print_success("Downloaded!")
                
            except Exception as e:
                
                print_error(f"Error downloading file: {e}")
                
        elif download == "n":
            
            print("Exiting...")
            
            exit()

        exit()

    
    if args.compile:
        try:
            print("Compiling...")
            Compileproject()
            time.sleep(1)
            with open("Project.cspm", 'r') as file:
                filedata = file.readlines()
                for line in filedata:
                    file_name = line.strip()
                    os.remove(file_name + ".cs")
            exit()
        except Exception as e:
            
            print_error(f"Error compiling file: {e}")
            
            exit()
            
    if args.compout:
        
        try:
            
            print("Compiling...")
            
            Compileproject()
            
            time.sleep(1)
            with open("Project.cspm", 'r') as file:
                
                filedata = file.readlines()
                
            
                
            # if it is, use dotnet.exe
            
            subprocess.run(['dotnet build'])
                
            # remove the .cs file
            for line in filedata:
                
                # get the file name
                
                file_name = line.strip()
                
                #os.remove(file_name + ".cs")
                
            exit()
            
        except Exception as e:
            
            print_error(f"Error compiling file: {e}")
            
            exit()
            
    elif args.input_file == "new":
        
        name = input("Name of project: ")
        
        type = input("Type of project (dll, executable): ")
        
        if type == "dll":
            
            CreateDll(name)
            
            exit()
            
        elif type == "executable":
            
            create_project(name)
            
            exit()
            
    #elif args.input_file == "update":
    
    elif args.input_file == "ouput":
        
        Compileprojectwithoutput()
        
        exit()
            
def main():
    
    """_summary_
    CubeScript's main function
    designed and tested by Charlie-sans
    
    """
    try:
        
        CheckCSVM()
        
        
        
    except Exception as e:
        
        print_info(f"Error checking for updates: {e}")
        
        print_info("are you connected to the internet?")
        
    
    
    # use checkhomedll to check if the home.dll is in the folder
    
    if CheckFile('home.dll') == False:
        
        print_error("home.dll not found! Would you like to download it? (y/n)")
        
        download = input(">>> ")
        
        if download == "y":
            
            print("Downloading...")
            
            try:
                
                link = "https://Github.com/charlie-sans/CSVM/raw/main/home.dll"
                
                download_file(link, ".")
                
                print_success("Downloaded!")
                
            except Exception as e:
                
                print_error(f"Error downloading file: {e}")
                
        elif download == "n":
            
            print("Exiting...")
            
            exit()

        exit()

    
    if args.compile:
        try:
            print("Compiling...")
            Compileproject()
            time.sleep(1)
            with open("Project.cspm", 'r') as file:
                filedata = file.readlines()
                for line in filedata:
                    file_name = line.strip()
                    os.remove(file_name + ".cs")
            exit()
        except Exception as e:
            
            print_error(f"Error compiling file: {e}")
            
            exit()
            
    if args.compout:
        
        try:
            
            print("Compiling...")
            
            Compileproject()
            
            with open("Project.cspm", 'r') as file:
                
                filedata = file.readlines()
                
        
                
            # if it is, use dotnet.exe
            
            subprocess.run(['dotnet build'])
                
            
                
            # remove the .cs file
            
            for line in filedata:
                
                # get the file name
                
                file_name = line.strip()
                
                os.remove(file_name + ".cs")
                
            exit()
            
        except Exception as e:
            
            print_error(f"Error compiling file: {e}")
            
            exit()
            
    elif args.input_file == "new":
        
        name = input("Name of project: ")
        
        type = input("Type of project (dll, executable): ")
        
        if type == "dll":
            
            CreateDll(name)
            
            exit()
            
        elif type == "executable":
            
            create_project(name)
            
            exit()
            
    #elif args.input_file == "update":
    
    elif args.input_file == "ouput":
        
        Compileprojectwithoutput()
        
        exit()
        
main()