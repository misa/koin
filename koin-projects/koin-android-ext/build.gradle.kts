plugins {
    id("com.android.library")
    id("kotlin-android")
}

defaultAndroidConfiguration()

publishAndroid(
        "koin-android-ext",
        "Koin project - koin-android"
)

dependencies {
    // Koin
    api(project(":koin-core-ext"))
    api(project(":koin-android-viewmodel"))
    // Architecture ViewModel
    api("android.arch.lifecycle:extensions:${Version.Dependency.androidArch}") {
        exclude(module = "livedata")
        exclude(module = "runtime")
    }

    // Test
    testImplementation(project(":koin-test"))
    testImplementation("org.mockito:mockito-inline:${Version.Test.mockito}")
}
