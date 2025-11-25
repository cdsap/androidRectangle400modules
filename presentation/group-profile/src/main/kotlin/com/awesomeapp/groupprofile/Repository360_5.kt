package com.awesomeapp.groupprofile

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.contactuser.Api296_6


@Singleton
class Repository360_5 @Inject constructor(
    private val api0: Api300_6,
    private val api1: Api304_6,
    private val api2: Api296_6
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