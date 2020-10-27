import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
}

publish(
        "koin-core",
        "Koin - simple dependency injection for Kotlin"
)

dependencies {
    // Kt
    api("org.jetbrains.kotlin:kotlin-stdlib:${Version.Dependency.kotlin}")

    testImplementation("junit:junit:${Version.Test.jUnit4}")
    testImplementation("org.mockito:mockito-inline:${Version.Test.mockito}")

    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.Test.coroutines}")
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions.freeCompilerArgs = listOf("-Xopt-in=kotlin.RequiresOptIn")
}
