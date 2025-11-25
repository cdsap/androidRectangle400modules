package com.awesomeapp.gallerylogin

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
import com.awesomeapp.gallerylogin.*
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.messagelogin.Api116_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.sessionlogin.Api120_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository144_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository144_5(Api92_6(),
            Api104_6(),
            Api116_6(),
            Api108_6(),
            Api84_6(),
            Api120_6()).getData()
        assertNotNull(result)
    }
}