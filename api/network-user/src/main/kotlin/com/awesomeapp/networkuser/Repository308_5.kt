package com.awesomeapp.networkuser

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.postcart.Api256_6


@Singleton
class Repository308_5 @Inject constructor(
    private val api0: Api248_6,
    private val api1: Api260_6,
    private val api2: Api252_6,
    private val api3: Api256_6
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