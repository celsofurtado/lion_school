package br.dev.celso.lionschoolprof.repository

import br.dev.celso.lionschoolprof.model.Aluno
import br.dev.celso.lionschoolprof.model.Disciplina

class StudentsRepository {

    companion object {
        fun getStudents() = listOf<Aluno>(
            Aluno(
                1,
                "Pedro da Silva",
                "20221201",
                "Desenvolvimento de Sistemas",
                listOf(
                    Disciplina(1, "DS", 90.0, "Concluído"),
                    Disciplina(1, "DS", 90.0, "Concluído"),
                    Disciplina(
                        1,
                        "DS",
                        90.0,
                        "Cursando"
                    )
                ),
                "",
                "Finalizado",
                "2020"
            ),
            Aluno(
                1,
                "Carlos Oliveira Dias",
                "20221201",
                "Desenvolvimento de Sistemas",
                listOf(
                    Disciplina(1, "DS", 90.0, "Concluído"),
                    Disciplina(1, "DS", 90.0, "Concluído"),
                    Disciplina(
                        1,
                        "DS",
                        90.0,
                        "Concluído"
                    )
                ),
                "",
                "Cursando",
                "2024"
            ),
            Aluno(
                1,
                "Fabiana Pereira",
                "20221201",
                "Desenvolvimento de Sistemas",
                listOf(
                    Disciplina(1, "DS", 90.0, "Concluído"),
                    Disciplina(1, "DS", 90.0, "Concluído"),
                    Disciplina(
                        1,
                        "DS",
                        90.0,
                        "Cursando"
                    )
                ),
                "",
                "Finalizado",
                "2021"
            ),
            Aluno(
                1,
                "Patrícia Golveia Luca",
                "20221201",
                "Desenvolvimento de Sistemas",
                listOf(
                    Disciplina(1, "DS", 90.0, "Concluído"),
                    Disciplina(1, "DS", 90.0, "Concluído"),
                    Disciplina(
                        1,
                        "DS",
                        90.0,
                        "Cursando"
                    )
                ),
                "",
                "Finalizado",
                "2022"
            ),
            Aluno(
                1,
                "Pedro da Silva",
                "20221201",
                "Desenvolvimento de Sistemas",
                listOf(
                    Disciplina(1, "DS", 90.0, "Concluído"),
                    Disciplina(1, "DS", 90.0, "Concluído"),
                    Disciplina(
                        1,
                        "DS",
                        90.0,
                        "Cursando"
                    )
                ),
                "",
                "Finalizado",
                "2020"
            ),
            Aluno(
                1,
                "Pedro da Silva",
                "20221201",
                "Desenvolvimento de Sistemas",
                listOf(
                    Disciplina(1, "DS", 90.0, "Concluído"),
                    Disciplina(1, "DS", 90.0, "Concluído"),
                    Disciplina(
                        1,
                        "DS",
                        90.0,
                        "Cursando"
                    )
                ),
                "",
                "Cursando",
                "2023"
            ),
            Aluno(
                1,
                "Pedro da Silva",
                "20221201",
                "Desenvolvimento de Sistemas",
                listOf(
                    Disciplina(1, "DS", 90.0, "Concluído"),
                    Disciplina(1, "DS", 90.0, "Concluído"),
                    Disciplina(
                        1,
                        "DS",
                        90.0,
                        "Cursando"
                    )
                ),
                "",
                "Finalizado",
                "2019"
            ),
            Aluno(
                1,
                "Pedro da Silva",
                "20221201",
                "Desenvolvimento de Sistemas",
                listOf(
                    Disciplina(1, "DS", 90.0, "Concluído"),
                    Disciplina(1, "DS", 90.0, "Concluído"),
                    Disciplina(
                        1,
                        "DS",
                        90.0,
                        "Cursando"
                    )
                ),
                "",
                "Cursando",
                "2024"
            )
        )
    }


}