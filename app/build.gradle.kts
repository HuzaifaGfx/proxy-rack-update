plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.hiltAndroid)
    kotlin("kapt")
}

android {
    namespace = "com.proxyrack.control"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.proxyrack.control"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.3.8"
    }

    buildFeatures {
        compose = true
        buildConfig = true
    }
}