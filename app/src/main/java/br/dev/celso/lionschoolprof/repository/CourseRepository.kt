package br.dev.celso.lionschoolprof.repository

import br.dev.celso.lionschoolprof.R
import br.dev.celso.lionschoolprof.model.Course

class CourseRepository {

    companion object {
        fun getCourses() = listOf<Course>(
            Course(
                1,
                "DS",
                R.drawable.lion_developer,
                "Desenvolvimento de Sistemas",
                "Aprenda a desenvolver aplicações web e mobile.",
                "3 SEMESTRES"
            ),
            Course(
                2,
                "RDS",
                R.drawable.lion_network,
                "Redes de Computadores",
                "Aprenda a projetar e instalar uma rede de computadores.",
                "4 SEMESTRES"
            ),
            Course(
                3,
                "ELE",
                R.drawable.lion_microchip,
                "Eletroeletrônica",
                "Aprenda a projetar e construir circuítos eletrônicos.",
                "4 SEMESTRES"
            ),
            Course(
                4,
                "MED",
                R.drawable.lion_media,
                "Produção Multimídia",
                "Aprenda a produzir e editar filmes e aminações 3D.",
                "4 SEMESTRES"
            )
        )
    }
}