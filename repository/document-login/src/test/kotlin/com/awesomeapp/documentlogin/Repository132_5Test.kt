package com.awesomeapp.documentlogin

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
import com.awesomeapp.documentlogin.*
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.messagelogin.Api116_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository132_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository132_5(Api120_6(),
            Api100_6(),
            Api88_6(),
            Api92_6(),
            Api84_6(),
            Api108_6(),
            Api112_6(),
            Api104_6(),
            Api96_6(),
            Api116_6()).getData()
        assertNotNull(result)
    }
}