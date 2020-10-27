import org.gradle.api.JavaVersion
import org.gradle.api.Project

fun Project.defaultAndroidConfiguration() {

    this.android {
        compileSdkVersion(Version.Android.target)
        defaultConfig {
            minSdkVersion(21)
            targetSdkVersion(Version.Android.target)
            testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
        }

        compileOptions {
            targetCompatibility = JavaVersion.VERSION_1_8
            sourceCompatibility = JavaVersion.VERSION_1_8
        }

        testOptions {
            unitTests.isReturnDefaultValues = true
        }
    }
}

fun Project.android(configure: com.android.build.gradle.LibraryExtension.() -> Unit): Unit =
        (this as org.gradle.api.plugins.ExtensionAware).extensions.configure("android", configure)
