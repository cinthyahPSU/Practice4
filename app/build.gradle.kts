plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.practice4"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.practice4"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    dependencies {
        implementation("com.google.android.gms:play-services-auth:21.2.0")
        implementation("androidx.appcompat:appcompat:1.7.0")
        implementation("com.google.android.material:material:1.12.0")
        implementation("androidx.constraintlayout:constraintlayout:2.1.4")
        implementation("com.google.firebase:firebase-auth:23.0.0")
        implementation("com.google.firebase:firebase-database:21.0.0")
        implementation("com.google.firebase:firebase-storage:21.0.0")
        testImplementation("junit:junit:4.13.2")
        implementation("com.github.bumptech.glide:glide:4.14.2")
        annotationProcessor("com.github.bumptech.glide:compiler:4.14.2")
        implementation("com.github.clans:fab:1.6.4")
        androidTestImplementation("androidx.test.ext:junit:1.2.1")
        androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")


    }
}