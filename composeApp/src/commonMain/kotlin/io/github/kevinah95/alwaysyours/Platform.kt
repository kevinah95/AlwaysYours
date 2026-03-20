package io.github.kevinah95.alwaysyours

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform