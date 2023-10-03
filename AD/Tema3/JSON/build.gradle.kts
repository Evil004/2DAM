plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "me.evil"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.json:json:20211205")
    implementation("com.squareup.moshi:moshi-kotlin:1.14.0")


}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}