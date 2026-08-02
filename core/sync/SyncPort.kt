package com.vimax.core.sync

interface SyncPort<T : SyncEntity> {
    suspend fun upsert(entity: T)
    suspend fun get(id: String): T?
    fun observe(id: String, observer: (T?) -> Unit): SyncSubscription
}

interface SyncEntity {
    val id: String
    val updatedAtEpochMillis: Long
}

fun interface SyncSubscription {
    fun cancel()
}
