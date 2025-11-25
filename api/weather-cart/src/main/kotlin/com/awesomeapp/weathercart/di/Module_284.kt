package com.awesomeapp.weathercart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.weathercart.Viewmodel284_1
import com.awesomeapp.weathercart.Activity284_2
import com.awesomeapp.weathercart.Activity284_3
import com.awesomeapp.weathercart.Fragment284_4
import com.awesomeapp.weathercart.Repository284_5
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.weathercart.Model284_8
import com.awesomeapp.weathercart.Model284_9
import com.awesomeapp.weathercart.Activity284_10
import com.awesomeapp.weathercart.Model284_12
import com.awesomeapp.weathercart.Activity284_13
import com.awesomeapp.weathercart.Model284_15
import com.awesomeapp.weathercart.Activity284_16

@Module
@InstallIn(SingletonComponent::class)
object Module_284 {
    @Provides
    @Singleton
    fun provideRepository284_5(
        api0: Api256_6 = Api256_6(),
        api1: Api280_6 = Api280_6(),
        api2: Api276_6 = Api276_6()
    ): Repository284_5 {
        return Repository284_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi284_6(): Api284_6 {
        return Api284_6()
    }
}