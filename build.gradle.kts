buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.20")
        classpath("com.android.tools.build:gradle:4.0.1")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
    }
}

subprojects {
    tasks {
        val java = "1.8"
        withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>{
            kotlinOptions { jvmTarget = java }
        }
    }
}
