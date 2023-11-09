import unittest
from transpiler import  transpile, Runproject, Compilee, Compileprojectwithoutput,Compileproject
from templates import create_project,CreateDll
import argparse
from erotrs import *

class TestTranspiler(unittest.TestCase):
    def test_transpile(self):
        # Test the transpile function to see if all is working!
        self.assertEqual(transpile('struct'), 'static void')
        self.assertEqual(transpile('revoid'), 'public static void')
        self.assertEqual(transpile('reint'), 'public static int' )
        self.assertEqual(transpile('reint'), 'public static int' )
        self.assertEqual(transpile('reint'), 'public static int' )
        self.assertEqual(transpile('reint'), 'public static int' )
        self.assertEqual(transpile('reint'), 'public static int' )
        self.assertEqual(transpile('reint'), 'public static int' )
        self.assertEqual(transpile('reint'), 'public static int' )
        self.assertEqual(transpile('reint'), 'public static int' )
        self.assertEqual(transpile('reint'), 'public static int' )
        
    def test_transpile_valid_code(self):
        # Test transpiling valid code
        source_code = 'struct'
        expected_output = 'static void'
        self.assertEqual(transpile("struct"), "static void")
        
    def test_transpile_invalid_code(self):
        # Test transpiling invalid code
        source_code = 'invalid syntax'
        with self.assertRaises(SyntaxError):
            transpile(source_code)
if __name__ == '__main__':
    unittest.main()