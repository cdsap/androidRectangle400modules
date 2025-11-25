package com.awesomeapp.contactuser

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
import com.awesomeapp.contactuser.*


@OptIn(ExperimentalCoroutinesApi::class)
class State296_14Test {
        @Test
    fun `test loading state`() {
        val state = State296_14.Loading
        assertNotNull(state)
    }

    @Test
    fun `test success state`() {
        val state = State296_14.Success("test data")
        assertNotNull(state)
        assertEquals("test data", (state as State296_14.Success).data)
    }

    @Test
    fun `test error state`() {
        val state = State296_14.Error("test error")
        assertNotNull(state)
        assertEquals("test error", (state as State296_14.Error).message)
    }
}