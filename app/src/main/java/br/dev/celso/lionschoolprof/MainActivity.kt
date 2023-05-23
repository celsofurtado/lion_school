package br.dev.celso.lionschoolprof

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.dev.celso.lionschoolprof.ui.screens.CoursesScreen
import br.dev.celso.lionschoolprof.ui.screens.MainScreen
import br.dev.celso.lionschoolprof.ui.screens.StudentDetail
import br.dev.celso.lionschoolprof.ui.screens.StudentsListScreen
import br.dev.celso.lionschoolprof.ui.theme.LionSchoolProfTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LionSchoolProfTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    //MainScreen()
                    //CoursesScreen()
                    //StudentsListScreen()
                    //StudentDetail()
                    val navigationController = rememberNavController()
                    NavHost(navController = navigationController, startDestination = "main_screen"){
                        composable(route = "main_screen"){ MainScreen(navigationController) }
                        composable(route = "courses_screen"){ CoursesScreen(navigationController) }
                        composable(route = "students_screen"){ StudentsListScreen(navigationController) }
                        composable(route = "student_detail_screen"){ StudentDetail(navigationController) }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LionSchoolProfTheme {
        Greeting("Android")
    }
}