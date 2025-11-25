package com.awesomeapp.logcheckout

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
import com.awesomeapp.logcheckout.*


@OptIn(ExperimentalCoroutinesApi::class)
class State221_33Test {
        @Test
    fun `test loading state`() {
        val state = State221_33.Loading
        assertNotNull(state)
    }

    @Test
    fun `test success state`() {
        val state = State221_33.Success("test data")
        assertNotNull(state)
        assertEquals("test data", (state as State221_33.Success).data)
    }

    @Test
    fun `test error state`() {
        val state = State221_33.Error("test error")
        assertNotNull(state)
        assertEquals("test error", (state as State221_33.Error).message)
    }
}