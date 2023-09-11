# Appium_tutorial

Appium Android Tutorials for absolute beginners
Installation:
NOTE: The assumption here is you already have Java installed on your machine.
• Install node js on your machine. Node.js. Once installed check the version of the node using node- v
• Once the node js is installed, install appium through the following command.
npm install -g appium
There are other ways to install the appium on your machine. But this is the easiest way. npm stands for node package manager. It will be installed when you install the node. the npm install will do the installation of the given program. -g indicates that it has been installed globally which means it can be accessed anywhere from that particular machine.
• Next we need Android SDK. If you have a better machine with a good configuration you can download android studio and that has Android SDK else, you can download the SDK alone.
• Download Android Studio from Download Android Studio and SDK tools | Android Developers
.
After downloading if you click next, next and install, by default the Android SDK will be available under
D:\Android\Sdk
• We are interested in two folders inside the SDK. One is tools and the other one is platform-tools.
![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/519842c3-6d53-4731-bedf-c5d8ae4171f5)

Another way to use  a Android studio from, Command line
![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/e2cd3b9f-65d4-4424-89a1-acee32f8b368)


After downloading open a command prompt and install Appium Doctor (GitHub - appium/appium- doctor: Tool to verify appium installation) execute the following command.
1 npm install appium-doctor -g
• This will install the appium-doctor globally in your machine. This is an awesome tool which will help us find the requirements in order to run the appium server. Let's see how this is going to be helpful in real time.
We didn't forget about the Android SDK. We will come to that after dealing with appium-doctor
After installing the appium-doctor, run the command appium-doctor in the command prompt. You will see a huge result in the prompt. 
![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/bdcee25a-3f2c-4134-9306-a6e4af447785)

There is no ANDROID_HOME and JAVA_HOME variable is not set! Message is displayed on the cmd prompt. 
So, we need to set the path for the both ANDROID_HOME and JAVA_HOME in to the Environmental variables. 
Once you downloaded the Android Studio. We need to add the path to the Local system Environment variables and System variables.
![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/0721d27a-7dad-49ee-8c84-eed95d5b1f9b)
![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/871f3da6-6b37-4c95-88ae-2799a4036898)


After adding these paths, click Ok and proceed for further. Like, again need to run the command as 
Appium-doctor.
You will see this below results guys!!!
![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/7ebcab54-4569-438d-bbfb-a79ca832ada4)

Now we’re successfully ready to work with Mobile Automation. 

Ohh, I missed one. We need to install the Vysor app for the Screen mirroring of the mobile. 
From the Android studio, the ADB devices is flowed for accessing the Vysor and our android apps. 
We need to enable the Developer options  in our mobile and USB debugging option too. 
For knowing the list of devices attached we can check it from cmd prompt. 
# adb devices
![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/c35d26c8-1a85-412d-adb8-96686b261d1b)

We can know our devices attached. Then we can able to access the Vysor app and the attached devices displayed on the below Screenshot.
![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/0d916c29-e7bd-41e2-961e-2a4edb8cd9df)


Then we configured our environment for automation testing. We moving for the coding part. For that we have some pre-requisites for Java Platform. 
Step 1: Download and install the Java platform - https://www.oracle.com/java/technologies/downloads/ 
Step 2: Download and install Eclipse IDE - https://www.eclipse.org/downloads/ 
Step 3: Click File -> New -> Project for the workspace. or Alt+Shift+N
![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/a3672c95-c883-478b-b19a-cc977e92eb2a)

Step 4: Need to select a wizard from the window. Note: For a Simple Project we can use to click the Java Project. If we need to use any Framework for our project we can go with the Maven Project and Click the Next button. 
![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/d8f5c489-340e-4582-93cd-7ba2d4ad6b2b)

Step 5: Click the Create a Simple project check box and Click the Next button.
![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/575cba51-4066-4bb5-b6e4-4326d23ad7c0)

Step 6: Enter the Group Id and Project name and Click the Finish button.
![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/0ace3edb-45f1-43c3-a454-c74b97b7cc15)

See, this is our Project Structure. 
![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/334d3526-78a8-41e4-81c1-20dca4a9ec86)

This is our pom.xml file. We need to search from the Maven Repository for our dependencies 
selenium-java
appium-client
![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/0b03d932-104e-4ca0-9ac3-a98be7f1d03e)

Then asusually, we need to update our pom.xml file.
We need to create the Package and Class
If you get notice in to the Project structure, there is Library displayed and it flows from our JDK nothing but our JAVA platform and src (Source Folder).
![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/ccd7b27c-13b4-48f0-90be-3b9e58b91d2d)

To create a new Package
Right click on the src and select the Package option for creating new package. Form the package, need to create one class.
![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/f7d00da5-fe96-49b7-bf3c-9cfdb88238b3)

Without creating a package, we able to create a class, at that time the package name takes as a default package. But src -> Package -> Class is the right way for creating the project for Selenium.
![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/b5139b64-cd22-49e3-8f51-ec0cd257b323)


Here our class name is calculator.java
From the Official documentation of the Appium, we have to enable the Desired capabilities.
 --> Appium official Documentation. 
![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/4dae85b1-ea76-4ace-b157-366ebde5a8e6)


From the cmd prompt, enter the appium
![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/dae0b6b9-4628-4ee1-b773-13247ba6278a)

Then we have our localhost url.
![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/57140005-fbc7-4e43-9b50-90044af2e225)

By using the Appium inspector, we able to get our Package name and elements for locating the ui element. 

![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/31db827b-fc25-4b4e-b4bb-76f5e4e34157)

After entering the desired capabilities, click the Start session. It navigates to the Element inspector page. 
![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/87ac0d30-02c8-40f2-b061-7cfada322d27)

Then, we copy our elements and paste in the coding area. 
![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/23305ad8-1b61-4d44-8433-892c7bc6a4b1)

All Set!!
We can click our Run button to execute our program. 
![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/b1112683-bad6-488c-b25c-31f6057f8cab)


We see our Output in the Console page. 
![image](https://github.com/Krishnasfw/Appium_tutorial/assets/105380930/082d151f-deef-4708-817d-98374e3611fc)


Thanks!
