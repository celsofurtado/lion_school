package br.dev.celso.lionschoolprof.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.dev.celso.lionschoolprof.R
import br.dev.celso.lionschoolprof.components.Header
import br.dev.celso.lionschoolprof.components.StudentGrade
import br.dev.celso.lionschoolprof.repository.StudentsRepository
import br.dev.celso.lionschoolprof.ui.theme.LionSchoolProfTheme

@Composable
fun StudentDetail(navigationController: NavHostController) {
    
    val student = StudentsRepository.getStudents()[0]
    
    LionSchoolProfTheme() {
        Surface() {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Header(text = "")
                Divider(
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .height(1.dp),
                    color = Color(0xFFFFC23D)
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Transparent)
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Card(
                        modifier = Modifier
                            .size(120.dp),
                        shape = CircleShape,
                        border = BorderStroke(width = 4.dp, color = Color(0xFFFFC23D))
                    ) {
                        Column(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.lion_user4),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                            )
                        }
                    }
                    Text(
                        text = student.nome,
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp,
                        color = Color(0xFF3347B0)
                    )
                    Text(
                        text = student.curso,
                        textAlign = TextAlign.Center,
                        fontSize = 14.sp
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                Card(
                    modifier = Modifier.fillMaxSize(),
                    backgroundColor = Color(0xff9FA9E1),
                    //backgroundColor = Color.White,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = "Desempenho",
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 16.dp)
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        LazyColumn(){
                            items(StudentsRepository.getStudents()[0].disciplinas){
                                StudentGrade(disciplina = it)
                            }
                        }
//                        for(disciplina in StudentsRepository.getStudents()[0].disciplinas){
//                            StudentGrade(disciplina = disciplina)
//                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun StudentDetailPreview() {
    LionSchoolProfTheme {
        //StudentDetail(navigationController)
    }
}