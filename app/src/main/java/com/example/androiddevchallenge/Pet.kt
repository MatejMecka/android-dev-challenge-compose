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

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun Pet(id: Int) {
    val selected_pet: Pet = pets[id - 1]
    Column{
        Column {
            Row {
                // Icon(Icons.filled.pet)
                Text("Cat")
            }
            Text("Border")
            Text("Location")
        }

        Column {
            Text("Gender")
            Text("Age")
        }

        Column {
            Text("Lorem ipsum sit dolor amet")
            Button(
                onClick = { /* Do something! */ },
            ) {
                Text("Adopt")
            }
        }
    }
}
