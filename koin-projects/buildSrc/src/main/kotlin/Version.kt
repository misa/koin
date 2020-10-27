object Version {
    const val koin = "2.2.0-rc-3"

    object Android {
        const val min = 14
        const val target = 29
        const val buildToolds = "30.0.2"
    }

    object Plugin {
        const val kotlin = "1.4.10"
        const val bintray = "1.8.5"
        const val dokka = "0.10.1"
        const val androidGradle = "4.2.0-alpha14"
        const val androidMavenPublish = "3.6.2"
    }

    object Dependency {
        const val kotlin = "1.4.10"
        const val ktor = "1.4.0"

        // Android
        const val androidArch = "1.1.1"
        const val androidSupportLibrary = "28.0.0"

        // Androidx
        const val androidxCompat = "1.2.0"
        const val androidxArch = "2.2.0"
        const val androidxSavedState = "2.2.0"
        const val androidxFragment = "1.2.5"
        const val androidxWorkManager = "2.3.0"
        const val androidxCompose = "1.0.0-alpha05"
    }

    object Test {
        const val jUnit4 = "4.13.1"
        const val jUnit5 = "5.6.2"
        const val mockito = "3.5.9"
        const val coroutines = "1.3.9"
    }
}
