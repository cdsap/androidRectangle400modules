package com.awesomeapp.fileprofile

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.locationprofile.Api356_6
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.groupprofile.Api360_6
import com.awesomeapp.galleryuser.Api340_6


@Singleton
class Repository376_5 @Inject constructor(
    private val api0: Api356_6,
    private val api1: Api324_6,
    private val api2: Api332_6,
    private val api3: Api360_6,
    private val api4: Api340_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() },
                        { api4.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}