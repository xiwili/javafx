# javafx

Pre-requisites to develop and run JavaFX apps:
- OpenJDK 17.
- Maven 3.x.

### helloworld

Modified from https://github.com/openjfx/samples. \
Tested on Windows 11, Mac OS 13.5, Ubuntu 22.04.

Two approaches to run the app:

1. Use javafx:run
```
cd helloworld
mvn javafx:run
```

2. Use jlink to build the bundle of custom JRE and app and run launcher. 
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
