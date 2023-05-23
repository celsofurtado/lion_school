package br.dev.celso.lionschoolprof.repository

import br.dev.celso.lionschoolprof.model.Aluno
import br.dev.celso.lionschoolprof.model.Disciplina

class StudentsRepository {

    companion object {
        fun getStudents() = listOf<Aluno>(
            Aluno(
                1,
                "Mariana Gomes Dias",
                "20221201",
                "Desenvolvimento de Sistemas",
                listOf(
                    Disciplina(1, "SIOP", 90.0, "Concluído"),
                    Disciplina(1, "INRI", 76.0, "Concluído"),
                    Disciplina(1, "INNU", 48.0, "Cursando"),
                    Disciplina(1, "HA", 23.0, "Cursando"),
                    Disciplina(1, "CAES", 78.0, "Cursando"),
                    Disciplina(1, "CAES", 34.0, "Cursando"),
                    Disciplina(1, "CAES", 42.0, "Cursando"),
                    Disciplina(1, "CAES", 100.0, "Cursando"),
                    Disciplina(1, "CAES", 76.0, "Cursando"),
                    Disciplina(1, "CAES", 43.0, "Cursando"),
                    Disciplina(1, "CAES", 87.0, "Cursando"),
                    Disciplina(1, "CAES", 96.0, "Cursando"),
                    Disciplina(1, "CAES", 66.0, "Cursando"),
                    Disciplina(1, "CAES", 27.0, "Cursando"),
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