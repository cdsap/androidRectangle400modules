package com.awesomeapp.pushprofile

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
import com.awesomeapp.pushprofile.*
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.weathercart.Api284_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository344_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository344_5(Api312_6(),
            Api292_6(),
            Api316_6(),
            Api308_6(),
            Api284_6()).getData()
        assertNotNull(result)
    }
}