package com.vimax.core.intent

data class Intent(
    val name: String,
    val actorId: String,
    val moduleId: String,
    val parameters: Map<String, Any?> = emptyMap()
)
