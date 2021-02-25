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

data class Pet(
    val id: Int,
    val name: String,
    val type: String,
    val breed: String,
    val age: Int,
    val sex: String,
)

val pets = arrayOf(
    Pet(1, "Jimmy", "Cat", "BengalCat", 17, "Male"),
    Pet(2, "Jane", "Dog", "Golden Retriever", 17, "Female"),
    Pet(3, "Julie", "Cat", "Mainee Coon", 17, "Female"),
    Pet(4, "Jimmy", "Dog", "German Shepherd Dog", 17, "Male"),
    Pet(5, "Jimmy", "Cat", "Persian Cat", 17, "Male"),
    Pet(6, "Jimmy", "Dog", "Beagle", 17, "Male"),
    Pet(7, "Jimmy", "Cat", "Scottish Fold", 17, "Male"),
    Pet(8, "Jimmy", "Dog", "Bulldog", 17, "Male"),
    Pet(9, "Jimmy", "Cat", "Bengal Cat", 17, "Male"),
)
