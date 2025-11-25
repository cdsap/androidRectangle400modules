package com.awesomeapp.groupprofile

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
import com.awesomeapp.groupprofile.*
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.contactuser.Api296_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository360_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository360_5(Api300_6(),
            Api304_6(),
            Api296_6()).getData()
        assertNotNull(result)
    }
}