package com.uvg.laboratoriofinal.presentation.listadoAsserts

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.room.util.TableInfo
import com.uvg.laboratoriofinal.ui.theme.LaboratorioFinalTheme

@Composable
fun ListadoAssertsRoute(

){
    ListadoAssertsScreen()

}

@Composable
private fun ListadoAssertsScreen(){
    Column(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primary)) {
            Text(text = "Listado de Assets", color = MaterialTheme.colorScheme.onPrimary, modifier = Modifier.padding(10.dp))
        }

        LazyColumn(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
            items(10){
                AssetsItem(
                    modifier = Modifier.fillMaxWidth().clickable {  }
                )
            }

        }


    }

}

@Composable
private fun AssetsItem(
    modifier: Modifier = Modifier
){
    Box(modifier = modifier.fillMaxWidth().clip(RoundedCornerShape(16.dp)).background(MaterialTheme.colorScheme.secondary)) {
        Column(modifier = Modifier.padding(10.dp)) {
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    text = "Name: Bitcoin - ",
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSecondary
                )
                Text(
                    text = "Symbol: B",
                    color = MaterialTheme.colorScheme.onSecondary

                )
            }
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    text = "Price: $100.00 - ",
                    color = MaterialTheme.colorScheme.onSecondary

                )
                Text(
                    text = "Change Percent: $10.00",
                    color = MaterialTheme.colorScheme.onSecondary

                )
            }
        }




    }
}


@Preview
@Composable
private fun PreviewList(){
    LaboratorioFinalTheme {
        Surface {
            ListadoAssertsScreen()
        }
    }
}