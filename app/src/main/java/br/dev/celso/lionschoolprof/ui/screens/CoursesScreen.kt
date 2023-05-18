package br.dev.celso.lionschoolprof.ui.screens

import android.widget.Space
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.dev.celso.lionschoolprof.R
import br.dev.celso.lionschoolprof.model.Course
import br.dev.celso.lionschoolprof.repository.CourseRepository
import br.dev.celso.lionschoolprof.ui.theme.LionSchoolProfTheme

@Composable
fun CoursesScreen() {
    LionSchoolProfTheme() {
        Surface(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo2),
                    contentDescription = "logo"
                )
                Divider(
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .height(2.dp),
                    color = Color(0xFFFFC23D)
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = TextFieldDefaults
                        .outlinedTextFieldColors(
                            unfocusedBorderColor = Color(0xFFFFC23D),
                            focusedBorderColor = Color(0xFFFFC23D)
                        ),
                    trailingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.search_24),
                            contentDescription = ""
                        )
                    },
                    placeholder = {
                        Text(text = "Find your course")
                    }
                )
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.list_24),
                        contentDescription = "",
                        tint = Color(0xFFFFC23D),
                        modifier = Modifier.size(36.dp)
                    )
                    Text(
                        text = "Courses",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF3347B0),
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                LazyColumn(){
                    items(CourseRepository.getCourses()){
                        CourseCard(course = it)
                    }
                }
            }
        }
    }
}

@Composable
fun CourseCard(course: Course) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 8.dp),
        backgroundColor = Color(0xFF3347B0),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(width = 2.dp, color = Color(0xFFFFC23D))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = course.icone),
                    contentDescription = "",
                    modifier = Modifier.size(80.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = course.sigla,
                    fontSize = 64.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFFC23D)
                )
            }
            Text(
                text = course.nome,
                fontSize = 20.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = course.descricao,
                fontSize = 14.sp,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(32.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Icon(
                    painter = painterResource(
                        id = R.drawable.watch_later_24),
                    contentDescription = "",
                    tint = Color(0xFFFFC23D),
                    modifier = Modifier.padding(end = 8.dp)
                )
                Text(
                    text = course.cargaHoraria,
                    fontSize = 16.sp,
                    color = Color(0xFFFFC23D)
                )
            }
        }
    }
}

@Preview
@Composable
fun CourseCardPreview() {
    LionSchoolProfTheme {
        CourseCard(course = Course(
            1,
            "DS",
            R.drawable.lion_developer,
            "Desenvolvimento de Sistemas",
            "Aprenda a desenvolver aplicações web e mobile.",
            "3 SEMESTRES"
        ))
    }
}

@Preview(showSystemUi = true)
@Composable
fun CoursesScreenPreview() {
    LionSchoolProfTheme {
        CoursesScreen()
    }
}