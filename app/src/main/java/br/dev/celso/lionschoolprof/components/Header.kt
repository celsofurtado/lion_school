package br.dev.celso.lionschoolprof.components

import android.preference.PreferenceActivity.Header
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
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
import br.dev.celso.lionschoolprof.ui.theme.LionSchoolProfTheme

@Composable
fun Header(text: String) {
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
            backgroundColor = if(text.isBlank()) {
                Color.Transparent
            } else {
                Color(0xFFFFC23D)
            },
            shape = CircleShape,
            elevation = if(text.isBlank()) 0.dp else 2.dp
        ) {
            Text(
                text = text,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF3347B0),
                modifier = Modifier.padding(12.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderPreview() {
    LionSchoolProfTheme {
        Header("DS")
    }
}