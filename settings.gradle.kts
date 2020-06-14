pluginManagement {
    repositories {
        jcenter()
        gradlePluginPortal()
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
    }
    val kotlinVersion: String by settings
    plugins {
        kotlin("jvm") version "$kotlinVersion"
        kotlin("kapt") version "$kotlinVersion"
    }
}

rootProject.name = "service-loader-n"

for (i in 1..500) {
    include("project$i")
}

for (project in rootProject.children) {
    project.projectDir = file("project")
}
