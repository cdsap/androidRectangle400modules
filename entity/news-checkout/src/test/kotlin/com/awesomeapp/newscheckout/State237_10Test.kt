package com.awesomeapp.newscheckout

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
import com.awesomeapp.newscheckout.*


@OptIn(ExperimentalCoroutinesApi::class)
class State237_10Test {
        @Test
    fun `test loading state`() {
        val state = State237_10.Loading
        assertNotNull(state)
    }

    @Test
    fun `test success state`() {
        val state = State237_10.Success("test data")
        assertNotNull(state)
        assertEquals("test data", (state as State237_10.Success).data)
    }

    @Test
    fun `test error state`() {
        val state = State237_10.Error("test error")
        assertNotNull(state)
        assertEquals("test error", (state as State237_10.Error).message)
    }
}