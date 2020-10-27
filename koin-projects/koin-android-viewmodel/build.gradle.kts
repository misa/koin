plugins {
    id("com.android.library")
    id("kotlin-android")
}

defaultAndroidConfiguration()

publishAndroid(
        "koin-android-viewmodel",
        "Koin project - koin-android-viewmodel"
)

dependencies {
    // Koin
//    api(project(":koin-core-ext"))
    api(project(":koin-android-scope"))
    // Architecture ViewModel
    api("android.arch.lifecycle:extensions:${Version.Dependency.androidArch}") {
        exclude(module = "livedata")
        exclude(module = "runtime")
    }

    // Test
    testImplementation(project(":koin-test"))
    testImplementation("org.mockito:mockito-inline:${Version.Test.mockito}")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions.freeCompilerArgs = listOf("-Xopt-in=kotlin.RequiresOptIn")
}
