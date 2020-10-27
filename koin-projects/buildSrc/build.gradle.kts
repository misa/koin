import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
    google()
}

dependencies {
    implementation("com.android.tools.build:gradle:4.2.0-alpha15")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.10")
}

//tasks.withType<KotlinCompile>().configureEach {
//    kotlinOptions {
//        jvmTarget = "1.8"
//        freeCompilerArgs = listOf("-Xallow-jvm-ir-dependencies", "-Xskip-prerelease-check")
//    }
//}
