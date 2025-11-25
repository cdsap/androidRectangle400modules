package com.awesomeapp.podcastidentity

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
import com.awesomeapp.podcastidentity.*


@OptIn(ExperimentalCoroutinesApi::class)
class Model190_15Test {
        @Test
    fun `test model creation`() {
        val model = Model190_15()
        assertNotNull(model)
    }
}