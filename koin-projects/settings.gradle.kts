rootProject.name = "Koin"

// Core
include(":koin-core")
include(":koin-test-core")

// JUnit
include(":koin-test")
include(":koin-test-junit5")

// Core Sample
include(":examples:coffee-maker")
// Core extended
include(":koin-core-ext")
// Gradle plugin
include(":koin-gradle-plugin")

// Android
include(":koin-android")
include(":examples:android-perfs")
include(":koin-android-scope", "koin-android-viewmodel")
include(":koin-androidx-scope", "koin-androidx-fragment", "koin-androidx-viewmodel")
include(":koin-androidx-workmanager")
include(":koin-androidx-compose")

// Android Ext
include(":koin-android-ext")
include(":koin-androidx-ext")

// Android Samples
include(":examples:android-samples")
include(":examples:androidx-samples")
include(":examples:androidx-compose")
include(":examples:androidx-compose-jetnews")

// Ktor
include(":koin-logger-slf4j")
include(":koin-ktor")
// Kto Sample
include(":examples:hello-ktor")

include(":examples:multimodule-ktor:app")
include(":examples:multimodule-ktor:common")
include(":examples:multimodule-ktor:module-a")
include(":examples:multimodule-ktor:module-b")
