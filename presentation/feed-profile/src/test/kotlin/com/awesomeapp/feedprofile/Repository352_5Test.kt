package com.awesomeapp.feedprofile

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
import com.awesomeapp.feedprofile.*
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.contactuser.Api296_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository352_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository352_5(Api304_6(),
            Api312_6(),
            Api288_6(),
            Api316_6(),
            Api308_6(),
            Api300_6(),
            Api284_6(),
            Api292_6(),
            Api320_6(),
            Api296_6()).getData()
        assertNotNull(result)
    }
}