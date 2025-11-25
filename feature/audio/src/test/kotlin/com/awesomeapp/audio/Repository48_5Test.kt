package com.awesomeapp.audio

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
import com.awesomeapp.audio.*
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.report.Api24_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository48_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository48_5(Api40_6(),
            Api12_6(),
            Api4_6(),
            Api36_6(),
            Api20_6(),
            Api32_6(),
            Api24_6()).getData()
        assertNotNull(result)
    }
}