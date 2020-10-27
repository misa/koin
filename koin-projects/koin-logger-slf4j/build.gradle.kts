plugins {
    kotlin("jvm")
}

publish(
        "koin-logger-slf4j",
        "Koin - simple dependency injection for Kotlin"
)

dependencies {
    // Koin
    api(project(":koin-core"))

    // SLF4J
    api("org.slf4j:slf4j-api:1.7.30")
}
