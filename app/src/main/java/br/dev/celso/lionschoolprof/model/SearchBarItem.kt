package br.dev.celso.lionschoolprof.model

import androidx.compose.ui.graphics.Color

data class SearchBarItem(
    var texto: String,
    var isSelected: Boolean = false,
    var cor: Color
)
