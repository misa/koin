plugins {
    kotlin("jvm")
}

publish(
        "koin-test-junit5",
        "Koin - simple dependency injection for Kotlin"
)

dependencies {
    // Koin
    api(project(":koin-core"))
    api(project(":koin-test-core"))
    api("org.junit.jupiter:junit-jupiter-engine:${Version.Test.jUnit5}")
    testImplementation("org.mockito:mockito-inline:${Version.Test.mockito}")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
