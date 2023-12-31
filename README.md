# javafx

### helloworld

Pre-requisites: 
- OpenJDK 17.
- Maven 3.x.

Modified from https://github.com/openjfx/samples. \
Tested on Windows 11, Mac OS 13.5, Ubuntu 22.04.

JavaFX version is 20.0.1, defined in pom.xml. No need to install JavaFX separately.

Two approaches to run the app:

1. Use javafx:run\
You can run the following commands on all the platforms (Mac/Linux/Windows).
```
cd helloworld
mvn javafx:run
```

2. Use jlink to build the bundle of custom JRE and app. 
- On Mac/Linux
```
cd helloworld
mvn javafx:jlink
target/helloworld/bin/launncher
```
- On Windows
```
cd helloworld
mvn javafx:jlink
target\helloworld\bin\launcher
```

### helloworld-gradle

Pre-requisites: 
- OpenJDK 17.
- Gradle 8.3.
- Win Toolset 3.11 for Windows installer generation.

The app is the same as helloworld. JavaFX version is 20.0.1, defined in build.gradle. No need to install JavaFX separately.

The reason for using gradle is that gradle has built-in support for jpackage. With gradle jpackage, we can easily build native installers - dmg, msi, deb, etc.

Two approaches to run the app:

1. Use gradlew run
- On Mac/Linux
```
cd helloworld-gradle
./gradlew clean run
```
- On Windows
```
cd helloworld-gradle
.\gradlew.bat clean run
```
2. Use jpackage to build the bundle of custom JRE and app. 
- On Mac/Linux
```
cd helloworld-gradle
./gradlew clean jpackage
build/image/bin/helloworld
```
After running the above gradle jpackage task, native installer files are generated. For Mac, build/jpackage/helloworld-1.0.0.dmg, build/jpackage/helloworld-1.0.0.pkg & build/jpackage/helloworld-1.0.0.app. For Linux, build/jpackage/helloworld_1.0.0-1_arm64.deb or uild/jpackage/helloworld_1.0.0-1_amd64.deb (Ubuntu, need to add installerType = 'deb' on build.gradle as the default installerType for Linux is rpm.) 

- On Windows
```
cd helloworld-gradle
.\gradlew.bat clean jpackage
build\image\bin\helloworld
```
After running the above gradle jpackage task, 2 Windows installer files are created - build\jpackage\helloworld-1.0.0.exe and build\jpackage\helloworld-1.0.0.msi.
  
