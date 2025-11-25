package com.awesomeapp.notecontact

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
import com.awesomeapp.notecontact.*
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.usercontact.Api56_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository84_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository84_5(Api80_6(),
            Api52_6(),
            Api56_6()).getData()
        assertNotNull(result)
    }
}