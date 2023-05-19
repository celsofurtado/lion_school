package br.dev.celso.lionschoolprof.repository

import androidx.compose.ui.graphics.Color
import br.dev.celso.lionschoolprof.model.SearchBar

class SearchBarRepository {

    companion object {
        fun getFiltros() = listOf<SearchBar>(
            SearchBar("Todos", true, Color(0xFFFFC23D)),
            SearchBar("Cursando", false, Color(0xFFFFC23D)),
            SearchBar("Finalizado", false, Color(0xFFFFC23D)),
        )
    }

}