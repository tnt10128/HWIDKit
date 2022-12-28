plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")
}

tasks.compileJava {
    options.release.set(8)
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
