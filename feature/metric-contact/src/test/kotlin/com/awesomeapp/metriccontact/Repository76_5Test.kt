package com.awesomeapp.metriccontact

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
import com.awesomeapp.metriccontact.*
import com.awesomeapp.share.Api16_6
import com.awesomeapp.todo.Api36_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository76_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository76_5(Api16_6(),
            Api36_6()).getData()
        assertNotNull(result)
    }
}