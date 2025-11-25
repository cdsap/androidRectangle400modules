package com.awesomeapp.feedprofile

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.contactuser.Api296_6


@Singleton
class Repository352_5 @Inject constructor(
    private val api0: Api304_6,
    private val api1: Api312_6,
    private val api2: Api288_6,
    private val api3: Api316_6,
    private val api4: Api308_6,
    private val api5: Api300_6,
    private val api6: Api284_6,
    private val api7: Api292_6,
    private val api8: Api320_6,
    private val api9: Api296_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() },
                        { api4.fetchData() },
                        { api5.fetchData() },
                        { api6.fetchData() },
                        { api7.fetchData() },
                        { api8.fetchData() },
                        { api9.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}