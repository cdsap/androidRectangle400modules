package com.awesomeapp.weathercart

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
import com.awesomeapp.weathercart.*
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.alarmcart.Api276_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository284_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository284_5(Api256_6(),
            Api280_6(),
            Api276_6()).getData()
        assertNotNull(result)
    }
}