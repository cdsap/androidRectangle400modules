package com.awesomeapp.timercheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.timercheckout.Viewmodel228_1
import com.awesomeapp.timercheckout.Activity228_2
import com.awesomeapp.timercheckout.Activity228_3
import com.awesomeapp.timercheckout.Fragment228_4
import com.awesomeapp.timercheckout.Repository228_5
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.timercheckout.Usecase228_7
import com.awesomeapp.timercheckout.Model228_9
import com.awesomeapp.timercheckout.Model228_10
import com.awesomeapp.timercheckout.Activity228_11
import com.awesomeapp.timercheckout.Model228_13
import com.awesomeapp.timercheckout.Activity228_14
import com.awesomeapp.timercheckout.Model228_16
import com.awesomeapp.timercheckout.Activity228_17

@Module
@InstallIn(SingletonComponent::class)
object Module_228 {
    @Provides
    @Singleton
    fun provideRepository228_5(
        api0: Api176_6 = Api176_6()
    ): Repository228_5 {
        return Repository228_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi228_6(): Api228_6 {
        return Api228_6()
    }
}