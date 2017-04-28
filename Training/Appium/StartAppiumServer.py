import subprocess
proc = subprocess.Popen('C:\\Program Files (x86)\\Appium\\node.exe C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\Appium.js' , stdin = subprocess.PIPE, stdout = subprocess.PIPE)
stdout, stderr = proc.communicate('dir c:\\')
stdout