package com.vimax.core.events

interface EventBus {
    fun publish(event: Event)
    fun subscribe(eventType: String, handler: (Event) -> Unit): Subscription
}

fun interface Subscription {
    fun cancel()
}
