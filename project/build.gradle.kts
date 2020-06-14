plugins {
    kotlin("jvm")
    kotlin("kapt")
}

repositories {
    jcenter()
    google()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
}

dependencies {
    kapt("com.facebook.litho:litho-processor:0.34.0")
    kapt("com.google.auto.service:auto-service:1.0-rc7")
    kapt("com.google.auto.value:auto-value:1.7")
    kapt("com.airbnb:deeplinkdispatch-processor:4.1.0")
    kapt("com.google.dagger:dagger:2.27")
}
