package br.dev.celso.lionschoolprof.repository

import androidx.compose.ui.graphics.Color
import br.dev.celso.lionschoolprof.model.SearchBarItem

class SearchBarRepository {

    companion object {
        fun getFiltros(): ArrayList<SearchBarItem> {

            val todos = SearchBarItem("Todos", true, Color(0xFFFFC23D))
            val cursando = SearchBarItem("Cursando", false, Color(0xFFFFC23D))
            val finalizado = SearchBarItem("Finalizado", false, Color(0xFFFFC23D))

            val itemsBar = ArrayList<SearchBarItem>()
            itemsBar.add(todos)
            itemsBar.add(cursando)
            itemsBar.add(finalizado)

            return itemsBar

        }

    }
}