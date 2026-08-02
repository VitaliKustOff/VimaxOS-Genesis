package com.vimax.core.intent

import com.vimax.core.modules.ModuleRegistry

class IntentEngine(
    private val moduleRegistry: ModuleRegistry
) {
    fun resolve(intent: Intent): IntentResult {
        val module = moduleRegistry.module(intent.moduleId)
            ?: return IntentResult.Rejected("Unknown module: ${intent.moduleId}")

        if (!module.supportedIntents.contains(intent.name)) {
            return IntentResult.Rejected("Unsupported intent: ${intent.name}")
        }

        return module.handle(intent)
    }
}

sealed interface IntentResult {
    data class Accepted(val message: String, val data: Map<String, Any?> = emptyMap()) : IntentResult
    data class Rejected(val reason: String) : IntentResult
}
