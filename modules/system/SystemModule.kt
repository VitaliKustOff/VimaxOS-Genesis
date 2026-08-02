package com.vimax.modules.system

import com.vimax.core.intent.Intent
import com.vimax.core.intent.IntentResult
import com.vimax.core.modules.VimaxModule

class SystemModule : VimaxModule {
    override val id: String = "vimax.system"
    override val version: String = "0.2.0-genesis"
    override val supportedIntents: Set<String> = setOf(
        "system.status",
        "system.modules"
    )

    override fun handle(intent: Intent): IntentResult =
        IntentResult.Accepted("System intent accepted: ${intent.name}")
}
