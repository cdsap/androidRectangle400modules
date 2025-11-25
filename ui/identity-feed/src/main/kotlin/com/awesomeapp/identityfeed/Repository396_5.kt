package com.awesomeapp.identityfeed

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.locationprofile.Api356_6
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.galleryuser.Api340_6
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.articleuser.Api336_6
import com.awesomeapp.pushprofile.Api344_6


@Singleton
class Repository396_5 @Inject constructor(
    private val api0: Api356_6,
    private val api1: Api328_6,
    private val api2: Api340_6,
    private val api3: Api348_6,
    private val api4: Api336_6,
    private val api5: Api344_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() },
                        { api4.fetchData() },
                        { api5.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}