package com.awesomeapp.statususer

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
import com.awesomeapp.statususer.*


@OptIn(ExperimentalCoroutinesApi::class)
class Model320_26Test {
        @Test
    fun `test model creation`() {
        val model = Model320_26()
        assertNotNull(model)
    }
}