package com.awesomeapp.cartfeed

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
import com.awesomeapp.cartfeed.*


@OptIn(ExperimentalCoroutinesApi::class)
class State398_15Test {
        @Test
    fun `test loading state`() {
        val state = State398_15.Loading
        assertNotNull(state)
    }

    @Test
    fun `test success state`() {
        val state = State398_15.Success("test data")
        assertNotNull(state)
        assertEquals("test data", (state as State398_15.Success).data)
    }

    @Test
    fun `test error state`() {
        val state = State398_15.Error("test error")
        assertNotNull(state)
        assertEquals("test error", (state as State398_15.Error).message)
    }
}