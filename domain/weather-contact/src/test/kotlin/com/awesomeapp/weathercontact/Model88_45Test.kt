package com.awesomeapp.weathercontact

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
import com.awesomeapp.weathercontact.*


@OptIn(ExperimentalCoroutinesApi::class)
class Model88_45Test {
        @Test
    fun `test model creation`() {
        val model = Model88_45()
        assertNotNull(model)
    }
}