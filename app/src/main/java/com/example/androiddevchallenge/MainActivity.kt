/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.MyTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                MyApp()
            }
        }
    }
}

// Start building your app here!
@Composable
fun MyApp() {
    Surface(color = MaterialTheme.colors.background) {
        Column {
            TopAppBar(title = { Text("Adopt a Pet!") })
            // Text(text = "Ready... Set... GO!")
            MessageList(pets)
        }
    }
}

@Composable
fun PetRow(pet: Pet) {
    Card(
        backgroundColor = MaterialTheme.colors.background, elevation = 12.dp,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Column {
            Row {
                Text(pet.name, style = MaterialTheme.typography.subtitle1, textAlign = TextAlign.Left,)
                Text(pet.type, style = MaterialTheme.typography.subtitle1, textAlign = TextAlign.Right,)
            }
            Row {
                Text("Age:" + pet.age, style = MaterialTheme.typography.subtitle1, textAlign = TextAlign.Left,)
                Text("Gender" + pet.sex, style = MaterialTheme.typography.subtitle1, textAlign = TextAlign.Right,)
            }
        }
    }
}

@Composable
fun MessageList(pets: Array<Pet>) {
    Column {
        pets.forEach { animal ->
            PetRow(animal)
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        MyApp()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        MyApp()
    }
}
