package com.awesomeapp.identityfeed

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
import com.awesomeapp.identityfeed.*
import com.awesomeapp.locationprofile.Api356_6
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.galleryuser.Api340_6
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.articleuser.Api336_6
import com.awesomeapp.pushprofile.Api344_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository396_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository396_5(Api356_6(),
            Api328_6(),
            Api340_6(),
            Api348_6(),
            Api336_6(),
            Api344_6()).getData()
        assertNotNull(result)
    }
}