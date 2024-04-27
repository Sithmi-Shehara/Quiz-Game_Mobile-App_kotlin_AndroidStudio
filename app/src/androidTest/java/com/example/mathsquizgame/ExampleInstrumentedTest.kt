package com.example.mathsquizgame

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun use_app_context() {
        // Context of the app under test.
        val app_context = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.mathsquizgame", app_context.packageName)
    }
}