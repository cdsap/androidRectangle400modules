package com.awesomeapp.playlistlogin

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
import com.awesomeapp.playlistlogin.*


@OptIn(ExperimentalCoroutinesApi::class)
class State147_6Test {
        @Test
    fun `test loading state`() {
        val state = State147_6.Loading
        assertNotNull(state)
    }

    @Test
    fun `test success state`() {
        val state = State147_6.Success("test data")
        assertNotNull(state)
        assertEquals("test data", (state as State147_6.Success).data)
    }

    @Test
    fun `test error state`() {
        val state = State147_6.Error("test error")
        assertNotNull(state)
        assertEquals("test error", (state as State147_6.Error).message)
    }
}