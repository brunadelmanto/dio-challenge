# JDK Zulu installation on Windows operating system :woman_technologist:

My computer works on Windows, so I will describe all the steps necessaries to install OpenJDK Zulu, that is a open source tested and certified. 

1. Enter in the [Azul website](https://www.azul.com/downloads/?package=jdk#download-openjdk) 

2. Do the download of the last version of JDK zip file (in my case I choose Windows operating system)

3. Go to *C:\Program Files\Java* (if you don't have Java's folder, create one)

4. Export the zip file inside Java's folder

5. Configuring the JAVA_HOME:

   5.1 Windows start menu -> search "*System*" in the Control Panel

   5.2 Go to "*Advanced System Settings*"

   5.3 It will open a new tab named System Proprieties -> go to "*Environment Variables*"

   5.4 Click on the button "*New*" in the part of "*Environment Variables*"

   5.5 It will open a new tab named "*New System Variable*" 

   5.6 Fill in the name of the variable: JAVA_HOME

   5.7 Fill in the value of variable: Here you will paste the path of JDK Zulu extraction file (example: *C:\Program Files\Java\zulu19.32.13-ca-jdk19.0.2-win_x64*) and click on the OK button

   5.8 Search de variable "*Path*" in the same part of "*Environment Variables*" and click on the button "*Edit*"

   5.9 Click on the button "*Edit*" in the part of "*Environment Variables*" (the same part) 

   5.10 Click on the button "New" and paste the same path of step 5.7 adding \bin

   5.11 With this new variable selected, click on the button "*Move Up*" until it is the first item in the line. 

   

   And now the configuration is finished, so we need check if it's running.

6. Open the "*Command Prompt*": Start Menu -> cmd

7. Type "java --version" and see if Java is installed on.

8. Type "git --version" and check if Git is installed on.



-----

*Reference: https://github.com/cami-la/curso-dio-dominando-ides-java*

---


