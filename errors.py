from colorama import Fore, Style

##important stuff##
def print_warning(message):
    print(f"{Fore.YELLOW}WARNING: {message}{Style.RESET_ALL}")
    
def print_error(message):
    print(f"{Fore.RED}ERROR: {message}{Style.RESET_ALL}")
    
def print_info(message):
    print(f"{Fore.BLUE}INFO: {message}{Style.RESET_ALL}")
    
def print_success(message):
    print(f"{Fore.GREEN}SUCCESS: {message}{Style.RESET_ALL}")
    
def print_debug(message):
    print(f"{Fore.MAGENTA}DEBUG: {message}{Style.RESET_ALL}")
    
def print_verbose(message):
    print(f"{Fore.CYAN}VERBOSE: {message}{Style.RESET_ALL}")
    
def print_link(message, url):
    print(f'\033]8;;{url}\033\\{message}\033]8;;\033\\')