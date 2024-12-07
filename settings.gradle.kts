rootProject.name = "sandbox-java-live-coding-interview"

pluginManagement {
    val springDependencyManagement: String by settings
    val springframeworkBoot: String by settings
    val lombokPlugin: String by settings

    plugins {
        id("io.spring.dependency-management") version springDependencyManagement
        id("org.springframework.boot") version springframeworkBoot
        id("io.freefair.lombok") version lombokPlugin
    }
}

include("examples:java-core")
