package com.awesomeapp.statuslogin

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
import com.awesomeapp.statuslogin.*


@OptIn(ExperimentalCoroutinesApi::class)
class State124_23Test {
        @Test
    fun `test loading state`() {
        val state = State124_23.Loading
        assertNotNull(state)
    }

    @Test
    fun `test success state`() {
        val state = State124_23.Success("test data")
        assertNotNull(state)
        assertEquals("test data", (state as State124_23.Success).data)
    }

    @Test
    fun `test error state`() {
        val state = State124_23.Error("test error")
        assertNotNull(state)
        assertEquals("test error", (state as State124_23.Error).message)
    }
}