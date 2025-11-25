package com.awesomeapp.photocart

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
import com.awesomeapp.photocart.*


@OptIn(ExperimentalCoroutinesApi::class)
class Model290_42Test {
        @Test
    fun `test model creation`() {
        val model = Model290_42()
        assertNotNull(model)
    }
}