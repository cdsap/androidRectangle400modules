package com.awesomeapp.calendaridentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.calendaridentity.Viewmodel176_1
import com.awesomeapp.calendaridentity.Activity176_2
import com.awesomeapp.calendaridentity.Activity176_3
import com.awesomeapp.calendaridentity.Fragment176_4
import com.awesomeapp.calendaridentity.Repository176_5
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.calendaridentity.Model176_8
import com.awesomeapp.calendaridentity.Model176_9
import com.awesomeapp.calendaridentity.Activity176_10
import com.awesomeapp.calendaridentity.Model176_12
import com.awesomeapp.calendaridentity.Activity176_13
import com.awesomeapp.calendaridentity.Model176_15
import com.awesomeapp.calendaridentity.Activity176_16
import com.awesomeapp.calendaridentity.Model176_18
import com.awesomeapp.calendaridentity.Activity176_19
import com.awesomeapp.calendaridentity.Model176_21
import com.awesomeapp.calendaridentity.Activity176_22
import com.awesomeapp.calendaridentity.Model176_24
import com.awesomeapp.calendaridentity.Activity176_25
import com.awesomeapp.calendaridentity.Model176_27
import com.awesomeapp.calendaridentity.Activity176_28
import com.awesomeapp.calendaridentity.Model176_30

@Module
@InstallIn(SingletonComponent::class)
object Module_176 {
    @Provides
    @Singleton
    fun provideRepository176_5(
        api0: Api128_6 = Api128_6()
    ): Repository176_5 {
        return Repository176_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi176_6(): Api176_6 {
        return Api176_6()
    }
}