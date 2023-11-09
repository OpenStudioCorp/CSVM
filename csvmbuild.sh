# This script is used to build CSVM.py
python3 -m nuitka --onefile CSVM.py
rm -rf CSVM.build CSVM.dist CSVM.onefile-build build
# Path: csvmrun.sh