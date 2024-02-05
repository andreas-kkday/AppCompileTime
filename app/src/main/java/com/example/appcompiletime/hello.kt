package com.example.appcompiletime


data class World(
    val func1: String,
    val lambda2: Int,
    val funcOfFunc: String = ""
)
fun hello(): World {
    triggerDeprecated()
    return World("", 1)
}