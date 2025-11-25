package com.awesomeapp.postcart

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
import com.awesomeapp.postcart.*
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.settingcheckout.Api216_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository256_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository256_5(Api224_6(),
            Api240_6(),
            Api212_6(),
            Api208_6(),
            Api228_6(),
            Api216_6()).getData()
        assertNotNull(result)
    }
}