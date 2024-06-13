plugins {
    kotlin("jvm") version "1.9.20"
    id("com.github.johnrengelman.shadow") version "8.1.1"
    antlr
}

version = "0.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    antlr("org.antlr:antlr4:4.13.1")
}

sourceSets {
    main {

        java {
            srcDir("src/main/antlr/gen")
        }

        antlr {
            srcDir("src/main/antlr/gen")
        }
    }
}

tasks.test {
    useJUnitPlatform()
}

tasks.shadowJar {
    archiveFileName.set("kotlin-interpreter-0.1.jar")
}

tasks.named("compileKotlin") {
    dependsOn(":generateGrammarSource")
}

kotlin {
    jvmToolchain(8)
}

tasks.generateGrammarSource {
    maxHeapSize = "64m"
    outputDirectory = file("src/main/antlr/gen")
}