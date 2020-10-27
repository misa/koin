plugins {
    kotlin("jvm")
}

publish(
        "koin-gradle-plugin",
        "Koin - simple dependency injection for Kotlin"
)

dependencies {
    // Kt
    api("org.jetbrains.kotlin:kotlin-stdlib:${Version.Dependency.kotlin}")
    api(project(":koin-test"))
    compileOnly(gradleApi())
}
