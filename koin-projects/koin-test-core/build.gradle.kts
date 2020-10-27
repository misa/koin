plugins {
    kotlin("jvm")
}

publish(
        "koin-test-core",
        "Koin - simple dependency injection for Kotlin"
)

dependencies {
    // Koin
    api(project(":koin-core"))
    testImplementation("junit:junit:${Version.Test.jUnit4}")
    testImplementation("org.mockito:mockito-inline:${Version.Test.mockito}")
}
