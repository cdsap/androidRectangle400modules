package com.awesomeapp.networklogin

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
import com.awesomeapp.networklogin.*
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.notificationcontact.Api68_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository112_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository112_5(Api52_6(),
            Api68_6()).getData()
        assertNotNull(result)
    }
}