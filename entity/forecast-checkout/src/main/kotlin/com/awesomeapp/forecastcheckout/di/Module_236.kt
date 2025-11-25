package com.awesomeapp.forecastcheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.forecastcheckout.Viewmodel236_1
import com.awesomeapp.forecastcheckout.Activity236_2
import com.awesomeapp.forecastcheckout.Activity236_3
import com.awesomeapp.forecastcheckout.Fragment236_4
import com.awesomeapp.forecastcheckout.Repository236_5
import com.awesomeapp.identitycheckout.Api200_6
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.forecastcheckout.Model236_8
import com.awesomeapp.forecastcheckout.Model236_9
import com.awesomeapp.forecastcheckout.Activity236_10
import com.awesomeapp.forecastcheckout.Model236_12
import com.awesomeapp.forecastcheckout.Activity236_13
import com.awesomeapp.forecastcheckout.Model236_15
import com.awesomeapp.forecastcheckout.Activity236_16
import com.awesomeapp.forecastcheckout.Model236_18
import com.awesomeapp.forecastcheckout.Activity236_19

@Module
@InstallIn(SingletonComponent::class)
object Module_236 {
    @Provides
    @Singleton
    fun provideRepository236_5(
        api0: Api200_6 = Api200_6(),
        api1: Api192_6 = Api192_6(),
        api2: Api176_6 = Api176_6()
    ): Repository236_5 {
        return Repository236_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi236_6(): Api236_6 {
        return Api236_6()
    }
}