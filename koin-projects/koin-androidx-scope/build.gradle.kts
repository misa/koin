plugins {
    id("com.android.library")
    id("kotlin-android")
}

defaultAndroidConfiguration()

publishAndroid(
        "koin-androidx-scope",
        "Koin project - koin-androidx-scope"
)

dependencies {
    api(project(":koin-android"))
    api("androidx.appcompat:appcompat:${Version.Dependency.androidxCompat}")
    api("androidx.lifecycle:lifecycle-common:${Version.Dependency.androidxArch}") {
        exclude(group = "core-runtime")
    }
    api("androidx.lifecycle:lifecycle-viewmodel-savedstate:${Version.Dependency.androidxSavedState}") {
        exclude(module = "lifecycle-livedata")
        exclude(module = "lifecycle-service")
        exclude(module = "lifecycle-process")
        exclude(module = "runtime")
        exclude(group = "androidx.legacy")
    }

    api("androidx.activity:activity:1.2.0-beta01")
    api("androidx.activity:activity-ktx:1.1.0")
    api("androidx.fragment:fragment-ktx:${Version.Dependency.androidxFragment}")

    testImplementation(project(":koin-test"))
    testImplementation("org.mockito:mockito-inline:${Version.Test.mockito}")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().all {

    kotlinOptions {
        jvmTarget = "1.8"
        apiVersion = "1.4"
        languageVersion = "1.4"
//        freeCompilerArgs = listOf("-XXLanguage:+InlineClasses")
    }
}
