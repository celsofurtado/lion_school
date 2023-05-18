package br.dev.celso.lionschoolprof.repository

import androidx.compose.ui.graphics.Color
import br.dev.celso.lionschoolprof.model.Filtro

class FiltroRepository {

    companion object {
        fun getFiltros() = listOf<Filtro>(
            Filtro("Todos", true, Color(0xFFFFC23D)),
            Filtro("Cursando", false, Color(0xFFFFC23D)),
            Filtro("Finalizado", false, Color(0xFFFFC23D)),
        )
    }

}