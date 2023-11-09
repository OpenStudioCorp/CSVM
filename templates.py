    

import subprocess
import platform
import os
import sys
import time
import webbrowser
import json
import requests
import urllib.request
import urllib.parse
from colorama import *
from versions import *

def print_error(text):
    """ Print a text in red
    """
    print(f"\033[1;31m{text}\033[0;0m")

def print_success(text):
    """ Print a text in green
    """
    print(f"\033[1;32m{text}\033[0;0m")
    
def print_info(text):
    """ Print a text in blue
    """
    print(f"\033[1;34m{text}\033[0;0m")
    
def print_link(text, link):
    """ Print a text in blue
    """
    print(f"\033[1;34m{text}\033[0;0m")
    print(f"\033[1;34m{link}\033[0;0m")
    

...

def download_file(link, directory):
    """
    Download a file from a link to a directory
    Args:
        link (_type_): pass a link to a file
        directory (_type_): the directory to download the file to
    """
    response = requests.get(link, stream=True)
    file_name = os.path.join(directory, link.split("/")[-1])

    with open(file_name, 'wb') as file:
        for chunk in response.iter_content(chunk_size=1024): 
            if chunk:
                file.write(chunk)


def CheckFile(file):
    """ Check if a file exists

    Args:
        file (_str_): pass a file to check if it exists

    Returns:
        _true/false_: returns true if the file exists and false if it does not
    """

    
    if os.path.isfile(file):
        return True
    else:
        return False

def print_error(text):
    """ Print a text in red
    """
    print(f"\033[1;31m{text}\033[0;0m")

def print_success(text):
    """ Print a text in green
    """
    print(f"\033[1;32m{text}\033[0;0m")

def print_info(text):
    """ Print a text in blue
    """
    print(f"\033[1;34m{text}\033[0;0m")

def print_link(text, link):
    """ Print a text in blue
    """
    print(f"\033[1;34m{text}\033[0;0m")
    print(f"\033[1;34m{link}\033[0;0m")


def get_version(name):
    """ Get the version of the program from the github repository
    """
    version = requests.get("https://raw.githubusercontent.com/OpenStudioCorp/NewOpenStudioCorpSite/main/OpenStudioCorpProjects.json")
    version = json.loads(version.text)
    version = version[name]
    return version

def CheckCSVM():
    """ look for a update for the program
    """
    version = requests.get("https://raw.githubusercontent.com/OpenStudioCorp/NewOpenStudioCorpSite/main/OpenStudioCorpProjects.json")
    name = 'CSVM'  
    version = get_version(name)
    if version == __csvm__:
        pass
    else:
        print("\n")
        print_info("hey! there is a new version of CSVM!")
        print_info("would you like to download it? (y/n)")
        # check what version of the compiler the user is using
        download = input(">>> ")
        if download == "y":
            print("Downloading...")
            
            try:
                link = f"https://github.com/charlie-sans/CSVM/raw/main/{filename}"
                # construct the lastt part of the link from filenam
                if platform.system() == "Windows":
                    filename = "CSVM.exe"
                
                elif platform.system() == "Linux":
                    filename = "CSVM.bin"
                    # merge the link and the filename
                download_file(link, ".")
                print_success("Downloaded!")
            except Exception as e:
                print_error(f"Error downloading file: {e}")
        elif download == "n":
            print("Exiting...")
            exit()
def CheckHomeDll():
    """ look for a update for the home.dll
    """

    version = requests.get("https://raw.githubusercontent.com/OpenStudioCorp/NewOpenStudioCorpSite/main/OpenStudioCorpProjects.json")
    name = 'home.dll'  
    version = get_version(name)
    if version == __dllversion__:
        pass
    else:
        print("\n")
        print_info("hey! there is a new version of the standard Home library!")
        print_link("Click here to download the new version", "https://CubeScript.vercel.app/Download ")
        print("\n")

## important stuff ##





def exit():
    print("Exiting...")
    sys.exit()


def help():
    # open a web browser to the documentation
    print("Opening documentation...")
    webbrowser.open("https://CubeScript.vercel.app/learn/functions")



# get the directory of the script for later use
script_dir = os.path.dirname(os.path.realpath(__file__))





def open_help():
    print("Welcome to the Cubescript to C# transpiler!")
    print("Type 'new' to create a new project")
    print("using -r as a argument will run the program")
    print("using -c will as a argument compile the program")
    print(
        "using -t without a file and as a argument will open the terminal for interacting with Documentation"
    )
def open_term_help():
    print("welcome to the official CubeScript terminal!")
    print("unfortunatly there is not much you can do here")
    print("type 'help' for help")
    print("type 'exit' to exit")
    



def CreateDll(name):
    """_summary_
    This function will create a dll file from a few templates
    """
    print("Creating project...")
   
        
    with open(f"{name}.csproj", "w") as file:
        file.write(f"""
                   <Project Sdk="Microsoft.NET.Sdk">
            <ItemGroup>
              <!-- .cs files -->

          <Reference Include="home.dll" />
        </ItemGroup>

  <PropertyGroup>
    <TargetFramework>net7.0</TargetFramework>
    <ImplicitUsings>enable</ImplicitUsings>
    <Nullable>enable</Nullable>
  </PropertyGroup>

</Project>""")
    with open(f"{name}.cusp", "w") as file:
        file.write(f"""using static Home;
                   
house {name} {{
    
    room stuff {{
        
        public struct function() {{
            
        }}
    }}
}}
""")
        with open("Project.cspm", "w") as file:
            file.write(
                f"""{name}""")
    print(f"Project {name} created! \n\n\n\n")
    print("You can run './CSVM -compile' to compile your project")
    print("Or you can add the CVSM to your path and run it that way with -c")
    print("Please make sure that you have .NET 6.0 installed")
    print("You can download it from https://dotnet.microsoft.com/download/dotnet/6.0")
    print("And you have Home.dll in the same folder as the program")
    print("you should have been given a copy of Home.dll with this program from the zip file you downloaded")
    
def create_project(name):
    """_summary_
    This function will create a Executible file for windows, linux and mac
    """
    print("Creating project...")

    with open("{0}.csproj".format(name), "w") as file:
        file.write(
            f"""<Project Sdk="Microsoft.NET.Sdk">

                <ItemGroup>
                      <!-- .cs files -->
             
                  <Reference Include="System" />
                  <Reference Include="home.dll" />
                </ItemGroup>

                <PropertyGroup>
                  <OutputType>Exe</OutputType>
                  <TargetFramework>net6.0</TargetFramework>
                  <ImplicitUsings>enable</ImplicitUsings>
                  <Nullable>enable</Nullable>
                </PropertyGroup>

                </Project>
"""
        )
    with open(f"{name}.cusp", "w") as file:
        file.write('using static Home;\n\nPrint("Hello World!");')
    with open("Project.cspm", "w") as file:
        file.write(
            f"""{name}""")

        print("hello")
    print(f"Project {name} created! \n\n\n\n")
    print("You can run './CSVM -c' to compile your project")
    print("Or you can add the CVSM to your path and run it that way with -c")
    print("Please make sure that you have .NET 6.0 installed")
    print("You can download it from https://dotnet.microsoft.com/download/dotnet/6.0")
    print("And you have Home.dll in the same folder as the program")
    print("you should have been given a copy of Home.dll with this program from the zip file you downloaded")
    
    
    