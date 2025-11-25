package com.awesomeapp.messagelogin

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
import com.awesomeapp.messagelogin.*
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.synccontact.Api64_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository116_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository116_5(Api76_6(),
            Api48_6(),
            Api60_6(),
            Api80_6(),
            Api56_6(),
            Api64_6()).getData()
        assertNotNull(result)
    }
}