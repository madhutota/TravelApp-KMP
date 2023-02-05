package com.example.travelapp_kmp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Application
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController =
    Application("TravelApp-KMP") {
        Column {
            // To skip upper part of screen.
            Box(
                modifier = Modifier
                    .height(30.dp)
            )
            Text("Hello")
        }
    }
