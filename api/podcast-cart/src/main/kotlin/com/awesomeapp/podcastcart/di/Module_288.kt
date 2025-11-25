package com.awesomeapp.podcastcart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.podcastcart.Viewmodel288_1
import com.awesomeapp.podcastcart.Activity288_2
import com.awesomeapp.podcastcart.Activity288_3
import com.awesomeapp.podcastcart.Fragment288_4
import com.awesomeapp.podcastcart.Repository288_5
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.podcastcart.Usecase288_7
import com.awesomeapp.podcastcart.Model288_9
import com.awesomeapp.podcastcart.Model288_10
import com.awesomeapp.podcastcart.Activity288_11

@Module
@InstallIn(SingletonComponent::class)
object Module_288 {
    @Provides
    @Singleton
    fun provideRepository288_5(
        api0: Api248_6 = Api248_6(),
        api1: Api256_6 = Api256_6(),
        api2: Api252_6 = Api252_6()
    ): Repository288_5 {
        return Repository288_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi288_6(): Api288_6 {
        return Api288_6()
    }
}