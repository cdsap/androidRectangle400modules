package com.awesomeapp.notificationcart

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.settingcheckout.Api216_6


@Singleton
class Repository264_5 @Inject constructor(
    private val api0: Api224_6,
    private val api1: Api204_6,
    private val api2: Api228_6,
    private val api3: Api216_6
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