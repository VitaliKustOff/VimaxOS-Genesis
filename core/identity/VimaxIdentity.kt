package com.vimax.core.identity

data class VimaxIdentity(
    val id: String,
    val displayName: String,
    val roles: Set<Role>
)

data class Role(
    val name: String,
    val moduleId: String? = null
)
