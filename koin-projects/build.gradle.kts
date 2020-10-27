buildscript {
    apply(from = "./gradle/versions.gradle")
    apply(from = "./gradle/versions-android.gradle")

    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.jfrog.bintray.gradle:gradle-bintray-plugin:${Version.Plugin.bintray}")
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:${Version.Plugin.dokka}")
        classpath("digital.wup:android-maven-publish:${Version.Plugin.androidMavenPublish}")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }

    group = "org.koin"
    version = Version.koin

    apply(plugin = "org.jetbrains.dokka")

    tasks.register<Jar>("dokkaJar") {
        // TODO Setup Dokka
    }
}
