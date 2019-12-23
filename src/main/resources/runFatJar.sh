#!/bin/bash

# This is a wrapper script!
# This wrapper script is specifically used to run our FAT jar.

# In this script, we can customize details like:
#   a)  which java shall be used?
#   b)  setup necessary classpath details etc..

echo "$0: PID is $$"
jarfile=/home/kartikey.sawant/mycode/javastuff/FatJarEg/target/fatjareg-1.0.jar

echo "USING JAVA: $(java -version)"
java -jar $jarfile
echo "---PROGRAM ENDS---"
