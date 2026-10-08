pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

plugins {
    // Disabled online toolchain resolver to prevent api.foojay.io 400 Bad Request errors in GitHub Actions
    // id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://androidx.dev/storage/compose-compiler/repository")
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://maven.pkg.jetbrains.space/public/p/ktor/eap")
        maven("https://s01.oss.sonatype.org/content/repositories/releases/")
    }

    versionCatalogs {
        create("libs")
    }
}

rootProject.name = "Llamatik"
include(":composeApp")
include(":shared")
include(":library")
