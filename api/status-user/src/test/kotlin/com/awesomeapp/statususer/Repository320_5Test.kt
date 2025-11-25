package com.awesomeapp.statususer

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
import com.awesomeapp.statususer.*
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.logincart.Api248_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository320_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository320_5(Api244_6(),
            Api268_6(),
            Api280_6(),
            Api248_6()).getData()
        assertNotNull(result)
    }
}