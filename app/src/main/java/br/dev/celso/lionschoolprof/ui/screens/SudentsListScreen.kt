package br.dev.celso.lionschoolprof.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.navigation.NavHostController
import br.dev.celso.lionschoolprof.R
import br.dev.celso.lionschoolprof.components.Header
import br.dev.celso.lionschoolprof.components.SearchBar
import br.dev.celso.lionschoolprof.model.Aluno
import br.dev.celso.lionschoolprof.repository.StudentsRepository
import br.dev.celso.lionschoolprof.ui.theme.LionSchoolProfTheme

@Composable
fun StudentsListScreen(navigationController: NavHostController) {

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
                Header(text = "DS")
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
                SearchBar()
//                LazyRow() {
//                    items(searchBarState) {
//                        MyChip(filtro = it)
//                    }
//                }


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
                        StudentCard(aluno = it, navigationController)
                    }
                }
            }
        }
    }
}

//@Composable
//fun SearchBar() {
//    var searchBarItemTodos by remember {
//        mutableStateOf(
//            SearchBarItem(
//                text = "Todos",
//                isSelected = true,
//                color = Color(0xFF3347B0)
//            )
//        )
//    }
//    var searchBarItemCursando by remember {
//        mutableStateOf(
//            SearchBarItem(
//                text = "Cursando",
//                isSelected = false,
//                color = Color(0xFFFFC23D)
//            )
//        )
//    }
//    var searchBarItemFinalizado by remember {
//        mutableStateOf(
//            SearchBarItem(
//                text = "Finalizado",
//                isSelected = false,
//                color = Color(0xFFFFC23D)
//            )
//        )
//    }
//    Row() {
//        SearchItem(searchBarItem = searchBarItemTodos) {
//            searchBarItemTodos =
//                SearchBarItem(text = "Todos", isSelected = true, color = Color(0xFF3347B0))
//            searchBarItemCursando =
//                SearchBarItem(text = "Cursando", isSelected = false, color = Color(0xFFFFC23D))
//            searchBarItemFinalizado =
//                SearchBarItem(text = "Finalizado", isSelected = false, color = Color(0xFFFFC23D))
//        }
//        SearchItem(searchBarItem = searchBarItemCursando) {
//            searchBarItemTodos =
//                SearchBarItem(text = "Todos", isSelected = false, color = Color(0xFFFFC23D))
//            searchBarItemCursando =
//                SearchBarItem(text = "Cursando", isSelected = true, color = Color(0xFF3347B0))
//            searchBarItemFinalizado =
//                SearchBarItem(text = "Finalizado", isSelected = false, color = Color(0xFFFFC23D))
//        }
//        SearchItem(searchBarItem = searchBarItemFinalizado) {
//            searchBarItemTodos =
//                SearchBarItem(text = "Todos", isSelected = false, color = Color(0xFFFFC23D))
//            searchBarItemCursando =
//                SearchBarItem(text = "Cursando", isSelected = false, color = Color(0xFFFFC23D))
//            searchBarItemFinalizado =
//                SearchBarItem(text = "Finalizado", isSelected = true, color = Color(0xFF3347B0))
//        }
//    }
//}
//
//@Composable
//fun SearchItem(searchBarItem: SearchBarItem, onClick: () -> Unit) {
//    Surface(
//        modifier = Modifier
//            .padding(end = 8.dp)
//            .clickable {
//                onClick()
//            },
//        color = searchBarItem.color,
//        shape = RoundedCornerShape(18.dp),
//        contentColor = Color.White
//    ) {
//        Text(
//            text = "${searchBarItem.text}",
//            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
//        )
//    }
//}

@Composable
fun StudentCard(aluno: Aluno, navigationController: NavHostController) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(bottom = 8.dp)
            .clickable { navigationController.navigate("student_detail_screen") },
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
        //StudentsListScreen(navigationController)
    }
}