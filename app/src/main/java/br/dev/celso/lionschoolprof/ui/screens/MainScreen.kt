package br.dev.celso.lionschoolprof.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.dev.celso.lionschoolprof.R
import br.dev.celso.lionschoolprof.ui.theme.LionSchoolProfTheme

@Composable
fun MainScreen(navController: NavHostController) {
    LionSchoolProfTheme() {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 64.dp)
        ) {
            Box() {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.Top
                    ) {
                        Image(
                            modifier = Modifier.size(250.dp),
                            painter = painterResource(
                                id = R.drawable.logo2
                            ),
                            contentDescription = "Logo"
                        )
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "Find your favorite course.",
                            fontSize = 24.sp,
                            color = Color(0xFF3347B0),
                            modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp),
                            textAlign = TextAlign.Center
                        )
                        Divider(
                            modifier = Modifier
                                .width(100.dp)
                                .height(8.dp)
                                .clip(shape = RoundedCornerShape(4.dp)),
                            color = Color(0xFFFFC23D)
                        )
                    }
                    Text(
                        text = "Get to your destination faster, study at the best vocational school in Brazil. Be the best version of yourself.",
                        fontSize = 18.sp,
                        color = Color(0xff9E9FA4),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 16.dp),
                        textAlign = TextAlign.Center
                    )
                    Button(
                        onClick = { navController.navigate("courses_screen") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 32.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xFFFFC23D)),
                        border = BorderStroke(width = 2.dp, color = Color(0xFF3347B0))
                    ) {
                        Text(
                            text = "Get Started",
                            fontSize = 20.sp,
                            color = Color(0xFF3347B0),
                            modifier = Modifier.padding(vertical = 8.dp)
                        )
                    }
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp)
                    ) {
                        Image(
                            painter = painterResource(
                                id = R.drawable.facebook2
                            ),
                            contentDescription = ""
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Image(
                            painter = painterResource(
                                id = R.drawable.instagram2
                            ),
                            contentDescription = ""
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Image(
                            painter = painterResource(
                                id = R.drawable.twitter2
                            ),
                            contentDescription = ""
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Image(
                            painter = painterResource(
                                id = R.drawable.youtube2
                            ),
                            contentDescription = ""
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainScreenPreview() {
    //MainScreen(navigationController)
}