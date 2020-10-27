plugins {
    id("com.android.library")
    kotlin("android")
}

publishAndroid(
        "koin-androidx-compose",
        "Koin project - koin-androidx-compose"
)

android {
    compileSdkVersion(30)
    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(30)
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        targetCompatibility = JavaVersion.VERSION_1_8
        sourceCompatibility = JavaVersion.VERSION_1_8
    }

    testOptions {
        unitTests.isReturnDefaultValues = true
    }

    kotlinOptions {
        jvmTarget = "1.8"
        useIR = true
        allWarningsAsErrors = true
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerVersion = "1.4.10"
        kotlinCompilerExtensionVersion = "1.0.0-alpha05"
    }
}

//tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>() {
//    kotlinOptions {
//        jvmTarget = "1.8"
//        freeCompilerArgs = freeCompilerArgs + listOf("-Xallow-jvm-ir-dependencies", "-Xskip-prerelease-check")
//    }
//}

dependencies {
    // Koin
    api(project(":koin-androidx-viewmodel"))
    testImplementation(project(":koin-test"))

    /* Compose */
    api("androidx.compose.runtime:runtime:1.0.0-alpha05")
    api("androidx.compose.ui:ui:1.0.0-alpha05")

    testImplementation("junit:junit:4.13.1")
    androidTestImplementation("androidx.test.ext:junit:1.1.2")
}
