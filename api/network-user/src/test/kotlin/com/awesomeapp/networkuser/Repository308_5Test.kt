package com.awesomeapp.networkuser

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
import com.awesomeapp.networkuser.*
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.postcart.Api256_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository308_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository308_5(Api248_6(),
            Api260_6(),
            Api252_6(),
            Api256_6()).getData()
        assertNotNull(result)
    }
}