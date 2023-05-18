package br.dev.celso.lionschoolprof.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.dev.celso.lionschoolprof.R
import br.dev.celso.lionschoolprof.model.Aluno
import br.dev.celso.lionschoolprof.model.Filtro
import br.dev.celso.lionschoolprof.repository.FiltroRepository
import br.dev.celso.lionschoolprof.repository.StudentsRepository
import br.dev.celso.lionschoolprof.ui.theme.LionSchoolProfTheme

@Composable
fun StudentsListScreen() {

    var filtrosState by remember {
        mutableStateOf(listOf<Filtro>())
    }

    filtrosState = FiltroRepository.getFiltros()

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
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column() {
                        Image(
                            painter = painterResource(id = R.drawable.logo2),
                            contentDescription = "logo"
                        )
                    }
                    Card(
                        backgroundColor = Color(0xFFFFC23D),
                        shape = CircleShape
                    ) {
                        Text(
                            text = "DS",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF3347B0),
                            modifier = Modifier.padding(12.dp)
                        )
                    }
                }
                Divider(
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .height(1.dp),
                    color = Color(0xFFFFC23D)
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        unfocusedBorderColor = Color(0xFFFFC23D),
                        focusedBorderColor = Color(0xFFFFC23D)
                    ),
                    shape = RoundedCornerShape(12.dp),
                    placeholder = {
                        Text(text = "Find a student")
                    },
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = ""
                        )
                    }
                )
                LazyRow() {
                    items(filtrosState) {
                        MyChip(filtro = it)
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.List,
                        contentDescription = "",
                        tint = Color(0xFFFFC23D),
                        modifier = Modifier.size(32.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Students List",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF3347B0)
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                LazyColumn() {
                    items(StudentsRepository.getStudents()) {
                        StudentCard(aluno = it)
                    }
                }
            }
        }
    }
}

@Composable
fun MyChip(filtro: Filtro, onSearchChange) {
    Surface(
        modifier = Modifier
            .padding(end = 8.dp)
            .clickable {},
        color = when {
            filtro.isSelected -> Color.Blue
            else -> filtro.cor
        },
        shape = RoundedCornerShape(18.dp),
        contentColor = Color.White
    ) {
        Text(
            text = "${filtro.texto}",
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}

@Composable
fun StudentCard(aluno: Aluno) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(bottom = 8.dp)
            .clickable { },
        backgroundColor = Color(0xff9FA9E1),
        //backgroundColor = Color.White,
        shape = RoundedCornerShape(8.dp),
        elevation = 0.dp
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Card(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(16.dp),
                shape = RectangleShape,
                backgroundColor = when (aluno.status) {
                    "Finalizado" -> Color(0xFFFFC23D)
                    else -> Color(0xFF3347B0)
                }
            ) {

            }
            Spacer(modifier = Modifier.width(8.dp))
            Card(
                modifier = Modifier.size(80.dp),
                shape = CircleShape
            ) {
                Image(
                    painter = painterResource(
                        id = R.drawable.lion_user4
                    ),
                    contentDescription = "",
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "${aluno.nome}",
                    fontSize = 20.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.School,
                        contentDescription = "",
                        tint = Color(0xFFFFC23D)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "${aluno.matricula}",
                        fontSize = 14.sp,
                        color = Color.White,
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End
                ) {
                    Icon(
                        imageVector = Icons.Default.CalendarMonth,
                        contentDescription = "",
                        tint = Color(0xFFFFC23D)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "${aluno.anoConclusao}",
                        fontSize = 14.sp,
                        color = Color.White,
                    )
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun StudentsListScreenPreview() {
    LionSchoolProfTheme {
        StudentsListScreen()
    }
}