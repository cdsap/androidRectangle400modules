package com.awesomeapp.checkoutprofile

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
import com.awesomeapp.checkoutprofile.*
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.mediacart.Api292_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository348_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository348_5(Api308_6(),
            Api288_6(),
            Api296_6(),
            Api320_6(),
            Api316_6(),
            Api292_6()).getData()
        assertNotNull(result)
    }
}