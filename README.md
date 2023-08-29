# javafx

### helloworld

Pre-requisites: 
- OpenJDK 17.
- Maven 3.x.

Modified from https://github.com/openjfx/samples. \
Tested on Windows 11, Mac OS 13.5, Ubuntu 22.04.

JavaFX version is 20.0.1, defined in pom.xml. No need to install JavaFX separately.

Two approaches to run the app:

1. Use javafx:run
```
cd helloworld
mvn javafx:run
```

2. Use jlink to build the bundle of custom JRE and app. 
- Mac/Linux
```
cd helloworld
mvn javafx:jlink
target/helloworld/bin/launncher
```
- Windows
```
cd helloworld
mvn javafx:jlink
target\helloworld\bin\launcher
```

### helloworld-gradle

Pre-requisites: 
- OpenJDK 17.
- Gradle 8.3.

The app is the same as helloworld. JavaFX version is 20.0.1, defined in build.gradle. No need to install JavaFX separately.

The reason for using grandle is that gradle has built-in support for jpackage. With gradle jpackage, we can easily build native installers - dmg, msi & deb.

Two approaches to run the app:

1. Use gradlew run
```
cd helloworld-gradle
./gradlew clean run
```

2. Use jpackage build the bundle of custom JRE and app. 
- Mac/Linux
```
cd helloworld-gradle
./gradlew clean jpackage
build/image/bin/helloworld
```
After running the above gradle jpackage task, a few native installers are created. 
- Mac: build/jpackage/helloworld-1.0.0.dmg, build/jpackage/helloworld-1.0.0.pkg & build/jpackage/helloworld-1.0.0.app. 
- Linux:
- Windows:  
