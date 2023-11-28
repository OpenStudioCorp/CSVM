using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Diagnostics;
using System.Threading;
using System.Reflection;
using System.Runtime.InteropServices;
using System.Security.Principal;
using System.Security.AccessControl;
using System.Security.Cryptography;
using System.Net;
//system.io is letterbox
//system is home



    public class Home
    { 
        public static string oops(string e)
        {
           throw new Exception(e); //exception: error
        }
        public static void Print(string text)
        {
            Console.WriteLine(text);
        }
        public static string ReadLine()
        { 
            var text = Console.ReadLine();
            return text;
        }
        public static string ReadKey()
        {
            var key = Console.ReadKey().ToString();
            return key;
        }
        public static int Add(int i, int v)

        {
            var add = i + v;
            return add;
        }
        public static int Subtract(int i, int v)
        {
            var subtract = i - v;
            return subtract;
        }
        public static int Multiply(int i, int v)
        {
            var multiply = i * v;
            return multiply;
        }
        public static int Divide(int i, int v)
        {
            var divide = i / v;
            return divide;
        }
        public static int Modulus(int i, int v)
        {
            var modulus = i % v;
            return modulus;
        }
        public static int Power(int i, int v)
        {
            var power = Math.Pow(i, v);
            return (int)power;
        }
        public static int SquareRoot(int i)
        {
            var squareroot = Math.Sqrt(i);
            return (int)squareroot;
        }
        
    }






    public class letterbox
    {
        
        
        //lib for reading and writing files
        public static string read(string filePath)
        {
            string contents = File.ReadAllText(filePath);
            return contents;
        }
        public static string write(string filePath, string contents)
        {
            File.WriteAllText(filePath, contents);
            return null;
        }
        public static string append(string a, string[] contents)
        {
            File.AppendAllLines(a, contents);
            return null;
        }
        public static string delete(string a)
        {
            File.Delete(a);
            return null;
        }
        public static string create(string filename)
        {
            File.Create(filename);
            return null;
        }
        public static string copy(string a, string b)
        {
            File.Copy(a,b);
            return null;
        }
        public static string move(string a, string b)
        {
            File.Move(a, b);
            return null;
        }
        public static string[] getfiles(string a)
        {
            var files = Directory.GetFiles(a);
            return files;
        }
        public static string[] getdirectories(string b)
        {
            var directories = Directory.GetDirectories(b);
            return directories;
        }
        public static string[] getdrives()
        {
            var drives = Directory.GetLogicalDrives();
            return drives;
        }
        public static string getcurrentdirectory()
        {
            var currentdirectory = Directory.GetCurrentDirectory();
            return currentdirectory;
        }
        public static string getparent(string a)
        {
            var parent = Directory.GetParent(a);
            return parent.FullName;
        }
        public static string getroot(string a)
        {
            var root = Directory.GetDirectoryRoot(a);
            return root;
        }
        public static string createdirectory(string a)
        {
            Directory.CreateDirectory(a);
            return null;
        }
        public static string deletedirectory(string a)
        {
            Directory.Delete(a);
            return null;
        }
        public static string movefile(string a, string b)
        {
            File.Move(a, b);
            return null;
        }
        public static string movefiles(string a, string b)
        {
            Directory.Move(a, b);
            return null;
        }
        public static string getfilename(string a)
        {
            var filename = Path.GetFileName(a);
            return filename;
        }
        public static string getfilenamewithoutextension(string a)
        {
            var filenamewithoutextension = Path.GetFileNameWithoutExtension(a);
            return filenamewithoutextension;
        }
        public static string getextension(string a)
        {
            var extension = Path.GetExtension(a);
            return extension;
        }
        public static string getfullpath(string a)
        {
            var fullpath = Path.GetFullPath(a);
            return fullpath;
        }
        public static string getinvalidfilenamechars()
        {
            var invalidfilenamechars = Path.GetInvalidFileNameChars();
            return invalidfilenamechars.ToString();
        }
        public static string getinvalidpathchars()
        {
            var invalidpathchars = Path.GetInvalidPathChars();
            return invalidpathchars.ToString();
        }
        public static string getpathroot(string obj)
        {
            var pathroot = Path.GetPathRoot(obj);
            return pathroot;
        }
        public static string getrandomfilename()
        {
            var randomfilename = Path.GetRandomFileName();
            return randomfilename;
        }
        public static string gettemppath()
        {
            var temppath = Path.GetTempPath();
            return temppath;
        }
        public static string gettempfilename()
        {
            var tempfilename = Path.GetTempFileName();
            return tempfilename;
        }
        public static string changefilename(string a, string b)
        {
            var changefilename = Path.ChangeExtension(a, b);
            return changefilename;
        }
        public static string combine(string a, string b)
        {
            var combine = Path.Combine(a, b);
            return combine;
        }
        public static string getdirectoryname(string a)
        {
            var directoryname = Path.GetDirectoryName(a);
            return directoryname;
        }
        

       
        
    }
    public class numbers
    {
        // cryptography section 
        public static byte[] generatecryptostring256(string a)
        {
            //generate a sha256 hash from string
            var generatecryptostring = SHA256.Create().ComputeHash(Encoding.UTF8.GetBytes(a));
            return generatecryptostring;
        }
        public static byte[] generatecryptostring512(string a)
        {
            //generate a sha512 hash from string
            var generatecryptostring2 = SHA512.Create().ComputeHash(Encoding.UTF8.GetBytes(a));
            return generatecryptostring2;
        }
        public static byte[] generatecryptostring384(string a)
        {
            //generate a sha384 hash from string
            var generatecryptostring3 = SHA384.Create().ComputeHash(Encoding.UTF8.GetBytes(a));
            return generatecryptostring3;
        }
        public static byte[] generatecryptostring1(string a)
        {
            //generate a sha1 hash from string
            var generatecryptostring4 = SHA1.Create().ComputeHash(Encoding.UTF8.GetBytes(a));
            return generatecryptostring4;
        }
        public static byte[] generatecryptostringmd5(string a)
        {
            //generate a md5 hash from string
            var generatecryptostring5 = MD5.Create().ComputeHash(Encoding.UTF8.GetBytes(a));
            return generatecryptostring5;
        }
        public static byte[] generatecryptostringripemd160(string a)
        {
            //generate a ripemd160 hash from string
            var generatecryptostring6 = RIPEMD160.Create().ComputeHash(Encoding.UTF8.GetBytes(a));
            return generatecryptostring6;
        }
        public static byte[] generatecryptostringsha256(string a)
        {
            //generate a sha256 hash from string
            var generatecryptostring7 = SHA256.Create().ComputeHash(Encoding.UTF8.GetBytes(a));
            return generatecryptostring7;
        }
        
    }
    public class Diagnosticinfo
    {
        //diagnostics class

        public static string getcurrentprocess()
        {
            var currentprocess = Process.GetCurrentProcess();
            return currentprocess.ToString();
        }
        public static string getcurrentprocessname()
        {
            var currentprocessname = Process.GetCurrentProcess().ProcessName;
            return currentprocessname;
        }
        public static string getcurrentprocessid()
        {
            var currentprocessid = Process.GetCurrentProcess().Id;
            return currentprocessid.ToString();
        }
        public static string getcurrentprocessstarttime()
        {
            var currentprocessstarttime = Process.GetCurrentProcess().StartTime;
            return currentprocessstarttime.ToString();
        }
        public static string getcurrentprocessprivatememorysize()
        {
            var currentprocessprivatememorysize = Process.GetCurrentProcess().PrivateMemorySize64;
            return currentprocessprivatememorysize.ToString();
        }
        public static string getcurrentprocessvirtualmemorysize()
        {
            var currentprocessvirtualmemorysize = Process.GetCurrentProcess().VirtualMemorySize64;
            return currentprocessvirtualmemorysize.ToString();
        }
        public static string getcurrentprocessworkingset()
        {
            var currentprocessworkingset = Process.GetCurrentProcess().WorkingSet64;
            return currentprocessworkingset.ToString();
        }
        public static string getcurrentprocessmachine()
        {
            var currentprocessmachine = Environment.MachineName;
            return currentprocessmachine;
        }
        public static string getcurrentprocessusername()
        {
            var currentprocessusername = Environment.UserName;
            return currentprocessusername;
        }
        public static string getcurrentprocessuserdomainname()
        {
            var currentprocessuserdomainname = Environment.UserDomainName;
            return currentprocessuserdomainname;
        }
        public static string getcurrentprocessversion()
        {
            var currentprocessversion = Environment.Version;
            return currentprocessversion.ToString();
        }
        public static string getcurrentprocessosversion()
        {
            var currentprocessosversion = Environment.OSVersion;
            return currentprocessosversion.ToString();
        }
        public static string getcurrentprocessprocessorcount()
        {
            var currentprocessprocessorcount = Environment.ProcessorCount;
            return currentprocessprocessorcount.ToString();
        }
        public static string getcurrentprocesssystemdirectory()
        {
            var currentprocesssystemdirectory = Environment.SystemDirectory;
            return currentprocesssystemdirectory;
        }
        public static string getcurrentprocessdrives()
        {
            var currentprocessdrives = Environment.GetLogicalDrives();
            return currentprocessdrives.ToString();
        }
        public static string getcurrentprocesscurrentdirectory()
        {
            var currentprocesscurrentdirectory = Environment.CurrentDirectory;
            return currentprocesscurrentdirectory;
        }
        public static string getcurrentprocesscurrentmanagedthreadid()
        {
            var currentprocesscurrentmanagedthreadid = Environment.CurrentManagedThreadId;
            return currentprocesscurrentmanagedthreadid.ToString();
        }
        public static string getcurrentprocessis64bitoperatingsystem()
        {
            var currentprocessis64bitoperatingsystem = Environment.Is64BitOperatingSystem;
            return currentprocessis64bitoperatingsystem.ToString();
        }
        public static string getcurrentprocessis64bitprocess()
        {
            var currentprocessis64bitprocess = Environment.Is64BitProcess;
            return currentprocessis64bitprocess.ToString();
        }

        public static string getcurrentprocesstickcount()
        {
            var currentprocessprocessorcount2 = Environment.TickCount;
            return currentprocessprocessorcount2.ToString();
        }
        public static string getcurrentprocessuserinteractive()
        {
            var currentprocessuserinteractive = Environment.UserInteractive;
            return currentprocessuserinteractive.ToString();
        }
        
    }
    public class threads
    {
        //threading class
        public static string getcurrentthread()
        {
            var currentthread = Thread.CurrentThread;
            return currentthread.ToString();
        }
        public static string getcurrentthreadid()
        {
            var currentthreadid = Thread.CurrentThread.ManagedThreadId;
            return currentthreadid.ToString();
        }
        public static string getcurrentthreadpriority()
        {
            var currentthreadpriority = Thread.CurrentThread.Priority;
            return currentthreadpriority.ToString();
        }
        public static string getcurrentthreadisbackground()
        {
            var currentthreadisbackground = Thread.CurrentThread.IsBackground;
            return currentthreadisbackground.ToString();
        }
        public static string getcurrentthreadispool()
        {
            var currentthreadispool = Thread.CurrentThread.IsThreadPoolThread;
            return currentthreadispool.ToString();
        }
        public static string getcurrentthreadname()
        {
            var currentthreadname = Thread.CurrentThread.Name;
            return currentthreadname;
        }
        public static string getcurrentthreadculture()
        {
            var currentthreadculture = Thread.CurrentThread.CurrentCulture;
            return currentthreadculture.ToString();
        }
        public static string getcurrentthreadcurrentuiculture()
        {
            var currentthreadcurrentuiculture = Thread.CurrentThread.CurrentUICulture;
            return currentthreadcurrentuiculture.ToString();
        }
        public static string getcurrentthreadapartmentstate()
        {
            var currentthreadapartmentstate = Thread.CurrentThread.GetApartmentState();
            return currentthreadapartmentstate.ToString();
        }
        public static string getcurrentthreadisalive()
        {
            var currentthreadisalive = Thread.CurrentThread.IsAlive;
            return currentthreadisalive.ToString();
        }
        
    }


