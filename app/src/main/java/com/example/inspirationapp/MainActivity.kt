package com.example.inspirationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.inspirationapp.model.Ayat
import com.example.inspirationapp.model.ayats
import com.example.inspirationapp.ui.theme.InspirationAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InspirationAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    InspirationApp()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InspirationApp() {
    Scaffold(
        topBar = {
            AyatTopAppBar()
        }
    ) { it ->
    LazyColumn(contentPadding = it,modifier = Modifier) {
        items(ayats) {
            AyatCard(
                ayat = it,
                modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_small))
            )
        }
    }
}

}

@Composable
fun AyatCard(ayat: Ayat, modifier: Modifier) {
    Card(modifier = modifier) {
        Column(modifier = Modifier.padding(24.dp)) {
            Text(
                text = LocalContext.current.getString(ayat.day),
                style = MaterialTheme.typography.labelSmall,
                textAlign = TextAlign.Justify,

            )
            Text(
                text = LocalContext.current.getString(ayat.title),
                style = MaterialTheme.typography.labelMedium,
                modifier = Modifier.padding(24.dp,0.dp,24.dp,4.dp),
                )
            Image(
                painter = painterResource(id = ayat.imageResource),
                modifier = Modifier
                    .fillMaxSize(1f),
                contentScale = ContentScale.FillBounds,
                contentDescription = null
            )
            Text(
                text = LocalContext.current.getString(ayat.verse),
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Justify
            )
        }

    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AyatTopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
    Row {
        Text(
            text = stringResource(id = R.string.app_bar),
            style = MaterialTheme.typography.displayLarge
        )

    }
    },
        modifier = modifier
    )
    
}

@Preview(showBackground = true)
@Composable
fun InspirationPreview() {
    InspirationAppTheme {
        InspirationApp()
    }
}