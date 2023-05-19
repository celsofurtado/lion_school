package br.dev.celso.lionschoolprof.model

import androidx.compose.ui.graphics.Color

data class SearchBar(
    val texto: String,
    val isSelected: Boolean = false,
    val cor: Color
)
