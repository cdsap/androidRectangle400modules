package com.awesomeapp.loguser

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
import com.awesomeapp.loguser.*


@OptIn(ExperimentalCoroutinesApi::class)
class Model319_22Test {
        @Test
    fun `test model creation`() {
        val model = Model319_22()
        assertNotNull(model)
    }
}