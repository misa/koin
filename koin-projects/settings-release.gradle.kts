rootProject.name = "Koin"

// Core
include("koin-core")
include("koin-test-core")

// JUnit
include("koin-test")
include("koin-test-junit5")

// Core extended
include("koin-core-ext")
// Gradle plugin
include("koin-gradle-plugin")

// Android
include("koin-android")
include("koin-android-scope" ,"koin-android-viewmodel")
include("koin-androidx-scope", "koin-androidx-fragment", "koin-androidx-viewmodel")
include("koin-androidx-compose")
include("koin-androidx-workmanager")

// Android Ext
include("koin-android-ext")
include("koin-androidx-ext")

// Android Samples
include("examples:android-samples")
include("examples:androidx-samples")

// Ktor
include("koin-logger-slf4j")
include("koin-ktor")
