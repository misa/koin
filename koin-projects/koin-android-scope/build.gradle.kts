plugins {
    id("com.android.library")
    id("kotlin-android")
}

defaultAndroidConfiguration()

publishAndroid(
        "koin-android-scope",
        "Koin project - koin-android-scope"
)

dependencies {
    api("com.android.support:appcompat-v7:${Version.Dependency.androidSupportLibrary}")
    api("android.arch.lifecycle:common:${Version.Dependency.androidArch}")
    // Koin
    api(project(":koin-android"))

    // Test
    testImplementation(project(":koin-test"))
    testImplementation("org.mockito:mockito-inline:${Version.Test.mockito}")
}
