package com.awesomeapp.newsidentity

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
import com.awesomeapp.newsidentity.*
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.maplogin.Api136_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository188_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository188_5(Api152_6(),
            Api140_6(),
            Api136_6()).getData()
        assertNotNull(result)
    }
}