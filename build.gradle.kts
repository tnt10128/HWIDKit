plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")
}

application {
    mainClass.set("hwidkit.App")
}

tasks.compileJava {
    options.release.set(8)
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
