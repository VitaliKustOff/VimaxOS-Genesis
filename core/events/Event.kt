package com.vimax.core.events

import java.time.Instant

data class Event(
    val type: String,
    val sourceModule: String,
    val subjectId: String?,
    val payload: Map<String, Any?>,
    val createdAt: Instant = Instant.now()
)
