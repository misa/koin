plugins {
    kotlin("jvm")
}

publish(
        "koin-ktor",
        "Koin - simple dependency injection for Ktor"
)

repositories {
    mavenCentral()
    maven("https://dl.bintray.com/kotlin/kotlinx")
    maven("https://dl.bintray.com/kotlin/ktor")
}

dependencies {
    api(project(":koin-core-ext"))
    testImplementation(project(":koin-test"))

    // Ktor
    api("io.ktor:ktor-server-core:${Version.Dependency.ktor}")
    testImplementation("io.ktor:ktor-server-test-host:${Version.Dependency.ktor}")
}
