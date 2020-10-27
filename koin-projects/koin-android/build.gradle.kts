plugins {
    id("com.android.library")
    id("kotlin-android")
}

defaultAndroidConfiguration()

publishAndroid(
        "koin-android",
        "Koin project - koin-android"
)

//android {
//    kotlinOptions {
//        jvmTarget = "1.8"
//    }
//}

//tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().all {
//    kotlinOptions {
//        jvmTarget = JavaVersion.VERSION_1_8.toString()
//    }
//}

dependencies {
    // Koin
    api(project(":koin-core"))
    testImplementation(project(":koin-test"))
    testImplementation("org.mockito:mockito-inline:${Version.Test.mockito}")
}
