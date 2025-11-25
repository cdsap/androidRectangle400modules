package com.awesomeapp.notecontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.notecontact.Viewmodel84_1
import com.awesomeapp.notecontact.Activity84_2
import com.awesomeapp.notecontact.Activity84_3
import com.awesomeapp.notecontact.Fragment84_4
import com.awesomeapp.notecontact.Repository84_5
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.notecontact.Usecase84_7
import com.awesomeapp.notecontact.Model84_9
import com.awesomeapp.notecontact.Model84_10
import com.awesomeapp.notecontact.Activity84_11
import com.awesomeapp.notecontact.Model84_13
import com.awesomeapp.notecontact.Activity84_14

@Module
@InstallIn(SingletonComponent::class)
object Module_84 {
    @Provides
    @Singleton
    fun provideRepository84_5(
        api0: Api80_6 = Api80_6(),
        api1: Api52_6 = Api52_6(),
        api2: Api56_6 = Api56_6()
    ): Repository84_5 {
        return Repository84_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi84_6(): Api84_6 {
        return Api84_6()
    }
}