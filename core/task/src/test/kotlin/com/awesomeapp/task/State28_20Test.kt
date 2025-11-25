package com.awesomeapp.task

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
import com.awesomeapp.task.*


@OptIn(ExperimentalCoroutinesApi::class)
class State28_20Test {
        @Test
    fun `test loading state`() {
        val state = State28_20.Loading
        assertNotNull(state)
    }

    @Test
    fun `test success state`() {
        val state = State28_20.Success("test data")
        assertNotNull(state)
        assertEquals("test data", (state as State28_20.Success).data)
    }

    @Test
    fun `test error state`() {
        val state = State28_20.Error("test error")
        assertNotNull(state)
        assertEquals("test error", (state as State28_20.Error).message)
    }
}