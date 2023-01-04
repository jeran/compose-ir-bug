package dev.jeran.compose.ir.bug

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform