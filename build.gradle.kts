plugins {
    kotlin("jvm") version "2.2.0"
}

group = "dev.drummachine"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("ch.qos.logback:logback-classic:1.5.18")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(24)
}