# javafx

# JavaFX helloworld

Modified from https://github.com/openjfx/samples. 

Pre-requisites:
- OpenJDK 17.
- Maven 3.x.

Two approaches to run the app:

1. mvn javafx:run

2. Use jlink to build the bundle of custom JRE and app and run launcher. 
- mvn javafx:jlink
- target/helloworld/bin/launncher
