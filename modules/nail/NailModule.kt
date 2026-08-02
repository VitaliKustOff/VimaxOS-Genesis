package com.vimax.modules.nail

import com.vimax.core.intent.Intent
import com.vimax.core.intent.IntentResult
import com.vimax.core.modules.VimaxModule

class NailModule : VimaxModule {
    override val id: String = "vimax.nail"
    override val version: String = "0.2.0-gem2"

    override val supportedIntents: Set<String> = setOf(
        "nail.appointment.request",
        "nail.appointment.confirm",
        "nail.appointment.reschedule",
        "nail.appointment.cancel",
        "nail.appointment.complete"
    )

    override fun handle(intent: Intent): IntentResult =
        IntentResult.Accepted(
            message = "Nail intent accepted: ${intent.name}",
            data = intent.parameters
        )
}
