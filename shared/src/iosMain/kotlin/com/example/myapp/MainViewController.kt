package com.example.myapp

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController

/** Called from Swift (`ContentView.swift`) to host the shared Compose UI. */
fun MainViewController(): UIViewController = ComposeUIViewController { App() }
