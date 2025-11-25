package com.awesomeapp.audio

import org.junit.Test
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.junit.Rule
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Assert.*
import kotlin.test.assertTrue
import kotlin.test.assertNotNull
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import com.awesomeapp.audio.*


@OptIn(ExperimentalCoroutinesApi::class)
class Model48_9Test {
        @Test
    fun `test model creation`() {
        val model = Model48_9()
        assertNotNull(model)
    }
}