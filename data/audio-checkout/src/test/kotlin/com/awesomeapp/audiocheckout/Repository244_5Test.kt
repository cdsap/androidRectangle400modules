package com.awesomeapp.audiocheckout

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
import com.awesomeapp.audiocheckout.*
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.taskcheckout.Api224_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository244_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository244_5(Api204_6(),
            Api212_6(),
            Api228_6(),
            Api236_6(),
            Api216_6(),
            Api208_6(),
            Api240_6(),
            Api220_6(),
            Api224_6()).getData()
        assertNotNull(result)
    }
}