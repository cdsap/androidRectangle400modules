package com.awesomeapp.statususer

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.logincart.Api248_6


@Singleton
class Repository320_5 @Inject constructor(
    private val api0: Api244_6,
    private val api1: Api268_6,
    private val api2: Api280_6,
    private val api3: Api248_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}