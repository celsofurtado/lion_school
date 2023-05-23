package br.dev.celso.lionschoolprof.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.dev.celso.lionschoolprof.model.SearchBarItem
import br.dev.celso.lionschoolprof.ui.theme.LionSchoolProfTheme

@Composable
fun SearchBar() {
    var searchBarItemTodos by remember {
        mutableStateOf(
            SearchBarItem(
                text = "Todos",
                isSelected = true,
                color = Color(0xFF3347B0)
            )
        )
    }
    var searchBarItemCursando by remember {
        mutableStateOf(
            SearchBarItem(
                text = "Cursando",
                isSelected = false,
                color = Color(0xFFFFC23D)
            )
        )
    }
    var searchBarItemFinalizado by remember {
        mutableStateOf(
            SearchBarItem(
                text = "Finalizado",
                isSelected = false,
                color = Color(0xFFFFC23D)
            )
        )
    }
    Row() {
        SearchItem(searchBarItem = searchBarItemTodos) {
            searchBarItemTodos =
                SearchBarItem(text = "Todos", isSelected = true, color = Color(0xFF3347B0))
            searchBarItemCursando =
                SearchBarItem(text = "Cursando", isSelected = false, color = Color(0xFFFFC23D))
            searchBarItemFinalizado =
                SearchBarItem(text = "Finalizado", isSelected = false, color = Color(0xFFFFC23D))
        }
        SearchItem(searchBarItem = searchBarItemCursando) {
            searchBarItemTodos =
                SearchBarItem(text = "Todos", isSelected = false, color = Color(0xFFFFC23D))
            searchBarItemCursando =
                SearchBarItem(text = "Cursando", isSelected = true, color = Color(0xFF3347B0))
            searchBarItemFinalizado =
                SearchBarItem(text = "Finalizado", isSelected = false, color = Color(0xFFFFC23D))
        }
        SearchItem(searchBarItem = searchBarItemFinalizado) {
            searchBarItemTodos =
                SearchBarItem(text = "Todos", isSelected = false, color = Color(0xFFFFC23D))
            searchBarItemCursando =
                SearchBarItem(text = "Cursando", isSelected = false, color = Color(0xFFFFC23D))
            searchBarItemFinalizado =
                SearchBarItem(text = "Finalizado", isSelected = true, color = Color(0xFF3347B0))
        }
    }
}

@Composable
fun SearchItem(searchBarItem: SearchBarItem, onClick: () -> Unit) {
    Surface(
        modifier = Modifier
            .padding(end = 8.dp)
            .clickable {
                onClick()
            },
        color = searchBarItem.color,
        shape = RoundedCornerShape(18.dp),
        contentColor = Color.White
    ) {
        Text(
            text = "${searchBarItem.text}",
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SearchBarPreview() {
    LionSchoolProfTheme {
        SearchBar()
    }
}