buildscript {
    repositories {
        mavenCentral()
        google()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.2")
    }
}

apply(plugin = "com.android.library")

android {
    namespace = "com.reactlibrary"
    compileSdkVersion(34)
    buildToolsVersion("34.0.0")

    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }

    lintOptions {
        isAbortOnError = false
    }

    packagingOptions {
        pickFirst("META-INF/**")
    }
}

dependencies {
    implementation("com.facebook.react:react-native:+")
    implementation(files("../mailcore2-android-4/mailcore2-android-4.aar"))
}
