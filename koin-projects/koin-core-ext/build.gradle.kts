plugins {
    kotlin("jvm")
}

publish(
        "koin-core-ext",
        "Koin - simple dependency injection for Kotlin"
)

dependencies {
    // Koin
    api(project(":koin-core"))

    // Kt
    api("org.jetbrains.kotlin:kotlin-reflect:${Version.Dependency.kotlin}")
    testImplementation(project(":koin-test"))
}
