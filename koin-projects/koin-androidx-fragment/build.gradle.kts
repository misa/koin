plugins {
    id("com.android.library")
    id("kotlin-android")
}

defaultAndroidConfiguration()

publishAndroid(
        "koin-androidx-fragment",
        "Koin project - koin-androidx-fragment"
)

dependencies {
    // Koin
    api(project(":koin-android"))
    // Architecture ViewModel
    api("androidx.fragment:fragment-ktx:${Version.Dependency.androidxFragment}")

    // Test
    testImplementation(project(":koin-test"))
    testImplementation("org.mockito:mockito-inline:${Version.Test.mockito}")
}
