package com.awesomeapp.postcart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.postcart.Viewmodel256_1
import com.awesomeapp.postcart.Activity256_2
import com.awesomeapp.postcart.Activity256_3
import com.awesomeapp.postcart.Fragment256_4
import com.awesomeapp.postcart.Repository256_5
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.postcart.Model256_8
import com.awesomeapp.postcart.Model256_9
import com.awesomeapp.postcart.Activity256_10
import com.awesomeapp.postcart.Model256_12
import com.awesomeapp.postcart.Activity256_13
import com.awesomeapp.postcart.Model256_15

@Module
@InstallIn(SingletonComponent::class)
object Module_256 {
    @Provides
    @Singleton
    fun provideRepository256_5(
        api0: Api224_6 = Api224_6(),
        api1: Api240_6 = Api240_6(),
        api2: Api212_6 = Api212_6(),
        api3: Api208_6 = Api208_6(),
        api4: Api228_6 = Api228_6(),
        api5: Api216_6 = Api216_6()
    ): Repository256_5 {
        return Repository256_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi256_6(): Api256_6 {
        return Api256_6()
    }
}