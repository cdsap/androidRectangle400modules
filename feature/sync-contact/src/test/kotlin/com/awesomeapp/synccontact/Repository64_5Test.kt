package com.awesomeapp.synccontact

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
import com.awesomeapp.synccontact.*
import com.awesomeapp.search.Api12_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.timer.Api32_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository64_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository64_5(Api12_6(),
            Api4_6(),
            Api40_6(),
            Api8_6(),
            Api36_6(),
            Api28_6(),
            Api16_6(),
            Api20_6(),
            Api24_6(),
            Api32_6()).getData()
        assertNotNull(result)
    }
}