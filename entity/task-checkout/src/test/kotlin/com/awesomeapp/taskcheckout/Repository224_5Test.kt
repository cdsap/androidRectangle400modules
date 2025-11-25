package com.awesomeapp.taskcheckout

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
import com.awesomeapp.taskcheckout.*
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.identitycheckout.Api200_6
import com.awesomeapp.photoidentity.Api192_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository224_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository224_5(Api168_6(),
            Api164_6(),
            Api196_6(),
            Api184_6(),
            Api188_6(),
            Api200_6(),
            Api192_6()).getData()
        assertNotNull(result)
    }
}