package com.example.myapp

import kotlin.test.Test
import kotlin.test.assertTrue

class PlatformTest {
    @Test
    fun platformNameIsKnown() {
        assertTrue(platformName in listOf("android", "ios"))
    }
}
