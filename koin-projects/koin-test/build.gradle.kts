plugins {
    kotlin("jvm")
}

publish(
        "koin-test",
        "Koin - simple dependency injection for Kotlin"
)

dependencies {
    // Koin
    api(project(":koin-core"))
    api(project(":koin-test-core"))
    api("junit:junit:${Version.Test.jUnit4}")
    testImplementation("org.mockito:mockito-inline:${Version.Test.mockito}")
}
