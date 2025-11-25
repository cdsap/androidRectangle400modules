package com.awesomeapp.eventuser

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
import com.awesomeapp.eventuser.*


@OptIn(ExperimentalCoroutinesApi::class)
class Model324_37Test {
        @Test
    fun `test model creation`() {
        val model = Model324_37()
        assertNotNull(model)
    }
}