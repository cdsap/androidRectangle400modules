package com.awesomeapp.identitycheckout

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
import com.awesomeapp.identitycheckout.*
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.documentlogin.Api132_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository200_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository200_5(Api160_6(),
            Api148_6(),
            Api156_6(),
            Api140_6(),
            Api124_6(),
            Api132_6()).getData()
        assertNotNull(result)
    }
}