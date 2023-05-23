package br.dev.celso.lionschoolprof.model

import androidx.compose.ui.graphics.Color

data class SearchBarItem(
    var text: String,
    var isSelected: Boolean = false,
    var color: Color
)
