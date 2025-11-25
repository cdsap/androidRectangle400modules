package com.awesomeapp.calendarprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.calendarprofile.Viewmodel372_1
import com.awesomeapp.calendarprofile.Activity372_2
import com.awesomeapp.calendarprofile.Activity372_3
import com.awesomeapp.calendarprofile.Fragment372_4
import com.awesomeapp.calendarprofile.Repository372_5
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.feedprofile.Api352_6
import com.awesomeapp.locationprofile.Api356_6
import com.awesomeapp.pushprofile.Api344_6
import com.awesomeapp.articleuser.Api336_6
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.calendarprofile.Api372_6
import com.awesomeapp.calendarprofile.Usecase372_7
import com.awesomeapp.calendarprofile.Model372_9
import com.awesomeapp.calendarprofile.Model372_10
import com.awesomeapp.calendarprofile.Activity372_11
import com.awesomeapp.calendarprofile.Model372_13
import com.awesomeapp.calendarprofile.Activity372_14
import com.awesomeapp.calendarprofile.Model372_16
import com.awesomeapp.calendarprofile.Activity372_17
import com.awesomeapp.calendarprofile.Model372_19
import com.awesomeapp.calendarprofile.Activity372_20
import com.awesomeapp.calendarprofile.Model372_22
import com.awesomeapp.calendarprofile.Activity372_23
import com.awesomeapp.calendarprofile.Model372_25
import com.awesomeapp.calendarprofile.Activity372_26
import com.awesomeapp.calendarprofile.Model372_28
import com.awesomeapp.calendarprofile.Activity372_29
import com.awesomeapp.calendarprofile.Model372_31
import com.awesomeapp.calendarprofile.Activity372_32
import com.awesomeapp.calendarprofile.Model372_34
import com.awesomeapp.calendarprofile.Activity372_35
import com.awesomeapp.calendarprofile.Model372_37
import com.awesomeapp.calendarprofile.Activity372_38
import com.awesomeapp.calendarprofile.Model372_40
import com.awesomeapp.calendarprofile.Activity372_41
import com.awesomeapp.calendarprofile.Model372_43

@Module
@InstallIn(SingletonComponent::class)
object Module_372 {
    @Provides
    @Singleton
    fun provideRepository372_5(
        api0: Api348_6 = Api348_6(),
        api1: Api352_6 = Api352_6(),
        api2: Api356_6 = Api356_6(),
        api3: Api344_6 = Api344_6(),
        api4: Api336_6 = Api336_6(),
        api5: Api328_6 = Api328_6()
    ): Repository372_5 {
        return Repository372_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi372_6(): Api372_6 {
        return Api372_6()
    }
}