package com.awesomeapp.cartlogin

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
import com.awesomeapp.cartlogin.*


@OptIn(ExperimentalCoroutinesApi::class)
class Model104_8Test {
        @Test
    fun `test model creation`() {
        val model = Model104_8()
        assertNotNull(model)
    }
}