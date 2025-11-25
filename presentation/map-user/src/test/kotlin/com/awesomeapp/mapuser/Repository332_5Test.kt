package com.awesomeapp.mapuser

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
import com.awesomeapp.mapuser.*
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.statususer.Api320_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository332_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository332_5(Api284_6(),
            Api304_6(),
            Api308_6(),
            Api320_6()).getData()
        assertNotNull(result)
    }
}