package com.awesomeapp.weathercart

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.alarmcart.Api276_6


@Singleton
class Repository284_5 @Inject constructor(
    private val api0: Api256_6,
    private val api1: Api280_6,
    private val api2: Api276_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}