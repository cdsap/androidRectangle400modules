package com.awesomeapp.fileprofile

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
import com.awesomeapp.fileprofile.*
import com.awesomeapp.locationprofile.Api356_6
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.groupprofile.Api360_6
import com.awesomeapp.galleryuser.Api340_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository376_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository376_5(Api356_6(),
            Api324_6(),
            Api332_6(),
            Api360_6(),
            Api340_6()).getData()
        assertNotNull(result)
    }
}