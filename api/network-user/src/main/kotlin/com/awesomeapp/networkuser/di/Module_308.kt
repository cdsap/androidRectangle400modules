package com.awesomeapp.networkuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.networkuser.Viewmodel308_1
import com.awesomeapp.networkuser.Activity308_2
import com.awesomeapp.networkuser.Activity308_3
import com.awesomeapp.networkuser.Fragment308_4
import com.awesomeapp.networkuser.Repository308_5
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.networkuser.Model308_8
import com.awesomeapp.networkuser.Model308_9
import com.awesomeapp.networkuser.Activity308_10
import com.awesomeapp.networkuser.Model308_12
import com.awesomeapp.networkuser.Activity308_13
import com.awesomeapp.networkuser.Model308_15

@Module
@InstallIn(SingletonComponent::class)
object Module_308 {
    @Provides
    @Singleton
    fun provideRepository308_5(
        api0: Api248_6 = Api248_6(),
        api1: Api260_6 = Api260_6(),
        api2: Api252_6 = Api252_6(),
        api3: Api256_6 = Api256_6()
    ): Repository308_5 {
        return Repository308_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi308_6(): Api308_6 {
        return Api308_6()
    }
}