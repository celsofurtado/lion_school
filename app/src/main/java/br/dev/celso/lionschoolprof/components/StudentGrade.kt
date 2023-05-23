package br.dev.celso.lionschoolprof.components

import android.content.res.Resources.Theme
import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.dev.celso.lionschoolprof.model.Disciplina
import br.dev.celso.lionschoolprof.ui.theme.LionSchoolProfTheme

@Composable
fun StudentGrade(disciplina: Disciplina) {
    var baseGraphWidth = 230
    var bar = disciplina.media / 100 * baseGraphWidth
    var barColor = if (disciplina.media < 60.0) {
        Color(0xffE25F67)
    } else if (disciplina.media >= 60.0 && disciplina.media < 80) {
        Color(0xffF6B817)
    } else {
        Color(0xff30B988)
    }
    Log.i("ds3", "StudentGrade: $bar")
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = disciplina.sigla,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.width(48.dp)
        )
        Column(
            modifier = Modifier
                .width(baseGraphWidth.dp)
                .height(32.dp)
                .clip(RoundedCornerShape(4.dp))
                .background(Color.White)
        ) {
            Card(
                modifier = Modifier
                    .width(bar.dp)
                    .height(32.dp),
                backgroundColor = barColor,
                border = BorderStroke(width = 1.dp, color = Color.Black)
            ) {

            }
        }
        Text(
            text = "${disciplina.media}",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.End,
            color = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun StudentGradePreview() {
    LionSchoolProfTheme {
        StudentGrade(
            Disciplina(
                id = 1,
                sigla = "ADM",
                media = 92.0,
                status = "Aprovado"
            )
        )
    }
}