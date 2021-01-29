plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-kapt")
    kotlin("plugin.serialization") version "1.4.10"
}

dependencies {
    implementation(project(":weatherstate"))
    implementation(project(":networking"))
    implementation("com.jakewharton.timber:timber:4.7.1")
    implementation("com.google.android.material:material:1.2.1")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    implementation("androidx.recyclerview:recyclerview:1.1.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.2")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.1.1")
    implementation("me.tatarka.bindingcollectionadapter2:bindingcollectionadapter:4.0.0")
    implementation("me.tatarka.bindingcollectionadapter2:bindingcollectionadapter-recyclerview:4.0.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.0.1")
    implementation("com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0")
    implementation("com.squareup.retrofit2:retrofit:2.6.4")
}

android {
    compileSdkVersion(29)
    defaultConfig {
        applicationId = "dk.shape.kmpweather.androidApp"
        minSdkVersion(24)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildFeatures {
        dataBinding = true
    }
}