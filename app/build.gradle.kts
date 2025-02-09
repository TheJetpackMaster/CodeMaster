plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("com.google.dagger.hilt.android")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.codemaster.codemasterapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.codemaster.codemasterapp"
        minSdk = 24


        //noinspection OldTargetApi
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.storage)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    //    DAGGER-HILT
    implementation("com.google.dagger:hilt-android:2.51.1")
    ksp("com.google.dagger:hilt-compiler:2.51.1")
//    kapt("com.google.dagger:hilt-android-compiler:2.48")

    //NavigationCompose
    implementation("androidx.navigation:navigation-compose:2.8.4")

    // LifeCycle Viewmodel
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.7")

    //Screen Sizes
    implementation("androidx.compose.material3:material3-window-size-class:1.3.1")

    //Lotie
    implementation("com.airbnb.android:lottie-compose:6.0.0")

    // Pager
    implementation ("com.google.accompanist:accompanist-pager:0.32.0")
    implementation ( "com.google.accompanist:accompanist-pager-indicators:0.32.0")

    // Room Database
    implementation ("androidx.room:room-runtime:2.6.1") // Latest version of Room
    ksp ("androidx.room:room-compiler:2.6.1")  // For Kotlin
    implementation("androidx.room:room-ktx:2.6.1") // Add this line for Room KTX support


    //Gson
    implementation ("com.google.code.gson:gson:2.8.9")

    //Coil
    implementation("io.coil-kt:coil-compose:2.6.0")

    //Glide
    implementation("com.github.bumptech.glide:compose:1.0.0-beta01")


}