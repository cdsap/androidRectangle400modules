package com.awesomeapp.mapuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.mapuser.Viewmodel332_1
import com.awesomeapp.mapuser.Activity332_2
import com.awesomeapp.mapuser.Activity332_3
import com.awesomeapp.mapuser.Fragment332_4
import com.awesomeapp.mapuser.Repository332_5
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.mapuser.Model332_8
import com.awesomeapp.mapuser.Model332_9
import com.awesomeapp.mapuser.Activity332_10
import com.awesomeapp.mapuser.Model332_12

@Module
@InstallIn(SingletonComponent::class)
object Module_332 {
    @Provides
    @Singleton
    fun provideRepository332_5(
        api0: Api284_6 = Api284_6(),
        api1: Api304_6 = Api304_6(),
        api2: Api308_6 = Api308_6(),
        api3: Api320_6 = Api320_6()
    ): Repository332_5 {
        return Repository332_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi332_6(): Api332_6 {
        return Api332_6()
    }
}