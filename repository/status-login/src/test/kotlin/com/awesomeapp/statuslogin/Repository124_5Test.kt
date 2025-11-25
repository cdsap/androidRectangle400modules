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
import com.awesomeapp.contactlogin.Api100_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository124_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository124_5(Api100_6()).getData()
        assertNotNull(result)
    }
}