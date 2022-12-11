
# 🖥 HWIDKit

HWIDKit is an extremely light library for Java/JVM-based application that allows you to generate
unique identifiers for user devices.

![Codefactor code quality](https://img.shields.io/codefactor/grade/github/TNT10128/HWIDKit?style=for-the-badge)

## Features

- Extremely lightweight - takes up nearly no space
- Choose what data is used to generate each identifier
- Cross platform - runs in any environment

## Installation

You can add HWIDKit to your project easily with Gradle or Maven.

### Gradle

Add the following repository to your `build.gradle` file:
```
maven { url 'https://jitpack.io' }
```
Then add this dependency:
```
implementation 'com.github.TNT10128:HWIDKit:1.0.0'
```
Replace 1.0.0 with the latest version in the Releases section.

### Maven

Add the following repository to your `pom.xml` file:
```
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>
```
Then add this dependency:
```
<dependency>
	<groupId>com.github.TNT10128</groupId>
	<artifactId>HWIDKit</artifactId>
	<version>1.0.0</version>
</dependency>
```
Replace 1.0.0 with the latest version in the Releases section.

## Usage/Examples

```java
package xyz.playneptune.hwidkit.example;

import xyz.playneptune.hwidkit.HwidKit;
import xyz.playneptune.hwidkit.SystemSpecification;

public class ExampleApp {

    public static void main(String[] args) {
        HwidKit hwidKit = new HwidKit();
        // In this example, the HWID is based on the OS
        // name, architecture, version, and the amount
        // of available logical processor cores.
        String generatedHwid = hwidKit.generateIdentifier(
            SystemSpecification.OS_NAME,
            SystemSpecification.OS_ARCHITECTURE,
            SystemSpecification.OS_VERSION,
            SystemSpecification.AVAILABLE_PROCESSORS,
        );
        System.out.println(generatedHwid);
    }

}
```
## License

HWIDKit is licensed under the [LGPL v3.0](https://choosealicense.com/licenses/lgpl-3.0/) license.
For more details, view the `copying.md` file in this repository.
