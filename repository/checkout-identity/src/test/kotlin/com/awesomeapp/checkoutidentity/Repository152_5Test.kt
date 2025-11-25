package com.awesomeapp.checkoutidentity

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
import com.awesomeapp.checkoutidentity.*
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.commentlogin.Api108_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository152_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository152_5(Api88_6(),
            Api112_6(),
            Api84_6(),
            Api108_6()).getData()
        assertNotNull(result)
    }
}