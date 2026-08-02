package com.vimax.core.modules

class ModuleRegistry(
    modules: Collection<VimaxModule>
) {
    private val modulesById = modules.associateBy { it.id }

    fun module(id: String): VimaxModule? = modulesById[id]

    fun all(): Collection<VimaxModule> = modulesById.values
}
