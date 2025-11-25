package com.awesomeapp.contactlogin

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
import com.awesomeapp.contactlogin.*
import com.awesomeapp.video.Api44_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.logincontact.Api52_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository100_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository100_5(Api44_6(),
            Api72_6(),
            Api80_6(),
            Api48_6(),
            Api76_6(),
            Api60_6(),
            Api64_6(),
            Api56_6(),
            Api52_6()).getData()
        assertNotNull(result)
    }
}