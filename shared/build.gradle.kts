plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("com.android.library")
}

kotlin {
    android()

    sourceSets {
        val commonMain by getting
        val androidMain by getting
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
