package com.vimax.security

import com.vimax.core.identity.VimaxIdentity
import com.vimax.core.intent.Intent

class TrustEngine {
    fun evaluate(identity: VimaxIdentity, intent: Intent): TrustDecision {
        val allowed = identity.roles.any { role ->
            role.moduleId == null || role.moduleId == intent.moduleId
        }

        return if (allowed) {
            TrustDecision.Allowed
        } else {
            TrustDecision.Denied("Identity has no role for module ${intent.moduleId}")
        }
    }
}

sealed interface TrustDecision {
    data object Allowed : TrustDecision
    data class Denied(val reason: String) : TrustDecision
}
