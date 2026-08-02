package com.vimax.core.modules

import com.vimax.core.intent.Intent
import com.vimax.core.intent.IntentResult

interface VimaxModule {
    val id: String
    val version: String
    val supportedIntents: Set<String>

    fun handle(intent: Intent): IntentResult
}
