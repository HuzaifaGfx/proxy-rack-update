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
        targetSdk = 34
        versionCode = 1
        versionName = "1.3.8"
        testInstrumentationRunner = "com.proxyrack.control.HiltTestRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            buildConfigField("String", "SERVER_IP", "\"mobile-socket.culturegps.com\"")
            buildConfigField("String", "SENTRY_DSN", "\"\"")
            manifestPlaceholders["SENTRY_DSN"] = ""
        }
        debug {
            isDebuggable = true
            buildConfigField("String", "SERVER_IP", "\"mobile-socket.culturegps.com\"")
            buildConfigField("String", "SENTRY_DSN", "\"\"")
            manifestPlaceholders["SENTRY_DSN"] = ""
        }
    }
    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
}

dependencies {
    implementation(files("libs/android_lib_emulator.aar"))
    implementation(libs.semver)
    implementation(libs.androidx.material.icons.core)
    implementation(libs.androidx.ui.text.google.fonts)
    implementation(libs.posthog.android)
    implementation(libs.retrofit2.retrofit)
    implementation(libs.converter.gson)
    implementation(libs.logging.interceptor)
    implementation(libs.hilt.android)
    implementation(libs.androidx.hilt.navigation.compose)
    kapt(libs.hilt.compiler)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.datastore.preferences)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.kotlinx.coroutines.android)
    debugImplementation(libs.androidx.ui.tooling)
    coreLibraryDesugaring(libs.desugar.jdk.libs)
}

kapt {
    correctErrorTypes = true
}