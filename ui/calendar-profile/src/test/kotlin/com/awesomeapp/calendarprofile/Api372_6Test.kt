package com.awesomeapp.calendarprofile

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
import com.awesomeapp.calendarprofile.*


@OptIn(ExperimentalCoroutinesApi::class)
class Api372_6Test {
        private lateinit var api: Api372_6

    @Before
    fun setup() {
        api = Api372_6()
    }

    @Test
    fun `test fetchData returns data`() = runTest {
        val result = api.fetchData()
        assertNotNull(result)
    }
}