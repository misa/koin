plugins {
    id("com.android.library")
    id("kotlin-android")
}

defaultAndroidConfiguration()

publishAndroid(
        "koin-androidx-workmanager",
        "Koin project - koin-androidx-workmanager"
)

dependencies {
    // Koin
    api(project(":koin-core"))
    api(project(":koin-androidx-scope"))

    // Android
    implementation("androidx.work:work-runtime-ktx:${Version.Dependency.androidxWorkManager}")

    // Test
    testImplementation(project(":koin-test"))
    testImplementation("org.mockito:mockito-inline:${Version.Test.mockito}")

    androidTestImplementation(project(":koin-test"))
    androidTestImplementation("androidx.test:runner:1.2.0")
    androidTestImplementation("androidx.test.ext:junit:1.1.1")
    androidTestImplementation("androidx.work:work-testing:${Version.Dependency.androidxWorkManager}")
}
