package com.awesomeapp.todocheckout

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
import com.awesomeapp.todocheckout.*
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.listidentity.Api184_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository232_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository232_5(Api188_6(),
            Api176_6(),
            Api164_6(),
            Api184_6()).getData()
        assertNotNull(result)
    }
}