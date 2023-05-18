package br.dev.celso.lionschoolprof.model

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

data class Filtro(
    val texto: String,
    val isSelected: Boolean = false,
    val cor: Color
)
