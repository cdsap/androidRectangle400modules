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
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.notecart.Api280_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository296_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository296_5(Api260_6(),
            Api276_6(),
            Api268_6(),
            Api280_6()).getData()
        assertNotNull(result)
    }
}