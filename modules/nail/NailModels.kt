package com.vimax.modules.nail

import com.vimax.core.sync.SyncEntity

enum class NailRole {
    CLIENT,
    MASTER
}

enum class AppointmentStatus {
    REQUESTED,
    CONFIRMED,
    RESCHEDULE_PROPOSED,
    CANCELLED,
    COMPLETED
}

data class NailAppointment(
    override val id: String,
    val masterId: String,
    val clientId: String,
    val serviceId: String,
    val startAtEpochMillis: Long,
    val status: AppointmentStatus,
    override val updatedAtEpochMillis: Long
) : SyncEntity
