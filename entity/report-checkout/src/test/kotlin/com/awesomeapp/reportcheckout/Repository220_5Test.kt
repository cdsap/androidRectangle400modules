package com.awesomeapp.reportcheckout

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
import com.awesomeapp.reportcheckout.*
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.identitycheckout.Api200_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository220_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository220_5(Api168_6(),
            Api180_6(),
            Api172_6(),
            Api196_6(),
            Api188_6(),
            Api176_6(),
            Api200_6()).getData()
        assertNotNull(result)
    }
}