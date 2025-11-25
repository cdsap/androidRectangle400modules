package com.awesomeapp.photoidentity

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
import com.awesomeapp.photoidentity.*
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.articlelogin.Api140_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository192_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository192_5(Api132_6(),
            Api152_6(),
            Api160_6(),
            Api144_6(),
            Api128_6(),
            Api136_6(),
            Api124_6(),
            Api148_6(),
            Api140_6()).getData()
        assertNotNull(result)
    }
}