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
import alwaysyours.composeapp.generated.resources.alegreya_italic
import alwaysyours.composeapp.generated.resources.alegreya_regular
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.resources.Font

@Composable
fun AlwaysYoursTheme(content: @Composable () -> Unit) {
  val alegreyaFontFamily =
      FontFamily(
          Font(Res.font.alegreya_regular, weight = FontWeight.Normal, style = FontStyle.Normal),
          Font(Res.font.alegreya_italic, weight = FontWeight.Normal, style = FontStyle.Italic),
      )
  val typography =
      Typography(
          bodyLarge = TextStyle(fontFamily = alegreyaFontFamily, fontWeight = FontWeight.Normal),
          bodyMedium = TextStyle(fontFamily = alegreyaFontFamily, fontWeight = FontWeight.Normal),
          bodySmall = TextStyle(fontFamily = alegreyaFontFamily, fontWeight = FontWeight.Normal),
          displayLarge = TextStyle(fontFamily = alegreyaFontFamily, fontWeight = FontWeight.Normal),
          displayMedium =
              TextStyle(fontFamily = alegreyaFontFamily, fontWeight = FontWeight.Normal),
          displaySmall = TextStyle(fontFamily = alegreyaFontFamily, fontWeight = FontWeight.Normal),
          headlineLarge =
              TextStyle(fontFamily = alegreyaFontFamily, fontWeight = FontWeight.Normal),
          headlineMedium =
              TextStyle(fontFamily = alegreyaFontFamily, fontWeight = FontWeight.Normal),
          headlineSmall =
              TextStyle(fontFamily = alegreyaFontFamily, fontWeight = FontWeight.Normal),
          titleLarge = TextStyle(fontFamily = alegreyaFontFamily, fontWeight = FontWeight.Normal),
          titleMedium = TextStyle(fontFamily = alegreyaFontFamily, fontWeight = FontWeight.Normal),
          titleSmall = TextStyle(fontFamily = alegreyaFontFamily, fontWeight = FontWeight.Normal),
          labelLarge = TextStyle(fontFamily = alegreyaFontFamily, fontWeight = FontWeight.Normal),
          labelMedium = TextStyle(fontFamily = alegreyaFontFamily, fontWeight = FontWeight.Normal),
          labelSmall = TextStyle(fontFamily = alegreyaFontFamily, fontWeight = FontWeight.Normal),
      )
  MaterialTheme(typography = typography, content = content)
}
