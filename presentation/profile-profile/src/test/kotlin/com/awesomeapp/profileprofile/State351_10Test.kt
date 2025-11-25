package com.awesomeapp.profileprofile

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
import com.awesomeapp.profileprofile.*


@OptIn(ExperimentalCoroutinesApi::class)
class State351_10Test {
        @Test
    fun `test loading state`() {
        val state = State351_10.Loading
        assertNotNull(state)
    }

    @Test
    fun `test success state`() {
        val state = State351_10.Success("test data")
        assertNotNull(state)
        assertEquals("test data", (state as State351_10.Success).data)
    }

    @Test
    fun `test error state`() {
        val state = State351_10.Error("test error")
        assertNotNull(state)
        assertEquals("test error", (state as State351_10.Error).message)
    }
}