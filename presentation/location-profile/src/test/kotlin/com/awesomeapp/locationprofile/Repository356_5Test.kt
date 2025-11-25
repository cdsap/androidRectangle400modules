package com.awesomeapp.locationprofile

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
import com.awesomeapp.locationprofile.*
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.podcastcart.Api288_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository356_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository356_5(Api312_6(),
            Api316_6(),
            Api320_6(),
            Api288_6()).getData()
        assertNotNull(result)
    }
}