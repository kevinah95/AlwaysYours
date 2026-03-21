/*
 * Copyright 2026 kevinah95 (Kevin A. Hernández Rostrán)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.kevinah95.alwaysyours

import alwaysyours.composeapp.generated.resources.Res
import alwaysyours.composeapp.generated.resources.cormorant_italic
import alwaysyours.composeapp.generated.resources.cormorant_regular
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.Font

@Composable
fun AlwaysYoursTheme(content: @Composable () -> Unit) {
  val alegreyaFontFamily =
      FontFamily(
          Font(Res.font.cormorant_regular, weight = FontWeight.Normal, style = FontStyle.Normal),
          Font(Res.font.cormorant_italic, weight = FontWeight.Normal, style = FontStyle.Italic),
      )
  val typography =
      Typography(
          bodyLarge =
              TextStyle(
                  fontFamily = alegreyaFontFamily,
                  fontWeight = FontWeight.Normal,
                  fontSize = 17.sp,
              ),
          bodyMedium =
              TextStyle(
                  fontFamily = alegreyaFontFamily,
                  fontWeight = FontWeight.Normal,
                  fontSize = 15.sp,
              ),
          bodySmall =
              TextStyle(
                  fontFamily = alegreyaFontFamily,
                  fontWeight = FontWeight.Normal,
                  fontSize = 13.sp,
              ),
          displayLarge =
              TextStyle(
                  fontFamily = alegreyaFontFamily,
                  fontWeight = FontWeight.Normal,
                  fontSize = 58.sp,
              ),
          displayMedium =
              TextStyle(
                  fontFamily = alegreyaFontFamily,
                  fontWeight = FontWeight.Normal,
                  fontSize = 46.sp,
              ),
          displaySmall =
              TextStyle(
                  fontFamily = alegreyaFontFamily,
                  fontWeight = FontWeight.Normal,
                  fontSize = 37.sp,
              ),
          headlineLarge =
              TextStyle(
                  fontFamily = alegreyaFontFamily,
                  fontWeight = FontWeight.Normal,
                  fontSize = 33.sp,
              ),
          headlineMedium =
              TextStyle(
                  fontFamily = alegreyaFontFamily,
                  fontWeight = FontWeight.Normal,
                  fontSize = 29.sp,
              ),
          headlineSmall =
              TextStyle(
                  fontFamily = alegreyaFontFamily,
                  fontWeight = FontWeight.Normal,
                  fontSize = 25.sp,
              ),
          titleLarge =
              TextStyle(
                  fontFamily = alegreyaFontFamily,
                  fontWeight = FontWeight.Normal,
                  fontSize = 23.sp,
              ),
          titleMedium =
              TextStyle(
                  fontFamily = alegreyaFontFamily,
                  fontWeight = FontWeight.Normal,
                  fontSize = 17.sp,
              ),
          titleSmall =
              TextStyle(
                  fontFamily = alegreyaFontFamily,
                  fontWeight = FontWeight.Normal,
                  fontSize = 15.sp,
              ),
          labelLarge =
              TextStyle(
                  fontFamily = alegreyaFontFamily,
                  fontWeight = FontWeight.Normal,
                  fontSize = 15.sp,
              ),
          labelMedium =
              TextStyle(
                  fontFamily = alegreyaFontFamily,
                  fontWeight = FontWeight.Normal,
                  fontSize = 13.sp,
              ),
          labelSmall =
              TextStyle(
                  fontFamily = alegreyaFontFamily,
                  fontWeight = FontWeight.Normal,
                  fontSize = 12.sp,
              ),
      )
  MaterialTheme(typography = typography, content = content)
}
