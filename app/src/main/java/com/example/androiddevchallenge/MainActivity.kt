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
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun SimpleNav() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "MyApp") { // this: NavGraphBuilder
        composable("MyApp") {
            MyApp(navController)
        }
        composable("Pet/{id}", arguments = listOf(navArgument("id") { type = NavType.IntType })) {
            backStackEntry ->
            Pet(backStackEntry.arguments?.getInt("id") ?: 0)
        }
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                SimpleNav()
            }
        }
    }
}

// Start building your app here!
@Composable
fun MyApp(navController: NavController) {
    Surface(color = MaterialTheme.colors.background) {
        Column {
            TopAppBar(title = { Text("Adopt a Pet!") })
            // Text(text = "Ready... Set... GO!")
            MessageList(pets, navController)
        }
    }
}

@Composable
fun PetRow(pet: Pet, navController: NavController) {
    Card(
        backgroundColor = MaterialTheme.colors.background, elevation = 12.dp,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .clickable(onClick = { navController.navigate("Pet/${pet.id}") })

    ) {
        Column {
            Text(pet.name, style = MaterialTheme.typography.h1, textAlign = TextAlign.Center, modifier = Modifier.padding(24.dp))
        }
    }
}

@Composable
fun MessageList(pets: Array<Pet>, navController: NavController) {
    Column {
        pets.forEach { animal ->
            PetRow(animal, navController)
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        SimpleNav()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        SimpleNav()
    }
}
