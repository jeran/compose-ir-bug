plugins {
    id("com.android.library")
    id("org.jetbrains.compose")
    id("org.jetbrains.kotlin.multiplatform")
}

kotlin {
    android()

    sourceSets {
        getByName("commonMain") {
            dependencies {
                api(compose.animation)
                api(compose.foundation)
                api(compose.material)
                api(compose.runtime)
                api(compose.ui)
            }
        }
    }
}

android {
    namespace = "dev.jeran.compose.ir.bug"
    compileSdk = 32
    defaultConfig {
        minSdk = 21
        targetSdk = 32
    }
}
