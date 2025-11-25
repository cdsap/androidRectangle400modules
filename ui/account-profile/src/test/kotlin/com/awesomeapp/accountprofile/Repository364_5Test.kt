package com.awesomeapp.accountprofile

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
import com.awesomeapp.accountprofile.*
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.groupprofile.Api360_6
import com.awesomeapp.feedprofile.Api352_6
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.articleuser.Api336_6
import com.awesomeapp.pushprofile.Api344_6
import com.awesomeapp.mapuser.Api332_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository364_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository364_5(Api348_6(),
            Api360_6(),
            Api352_6(),
            Api324_6(),
            Api336_6(),
            Api344_6(),
            Api332_6()).getData()
        assertNotNull(result)
    }
}