package com.awesomeapp.eventuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.eventuser.Viewmodel324_1
import com.awesomeapp.eventuser.Activity324_2
import com.awesomeapp.eventuser.Activity324_3
import com.awesomeapp.eventuser.Fragment324_4
import com.awesomeapp.eventuser.Repository324_5
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.eventuser.Usecase324_7
import com.awesomeapp.eventuser.Model324_9
import com.awesomeapp.eventuser.Model324_10
import com.awesomeapp.eventuser.Activity324_11
import com.awesomeapp.eventuser.Model324_13
import com.awesomeapp.eventuser.Activity324_14
import com.awesomeapp.eventuser.Model324_16
import com.awesomeapp.eventuser.Activity324_17
import com.awesomeapp.eventuser.Model324_19
import com.awesomeapp.eventuser.Activity324_20
import com.awesomeapp.eventuser.Model324_22
import com.awesomeapp.eventuser.Activity324_23
import com.awesomeapp.eventuser.Model324_25
import com.awesomeapp.eventuser.Activity324_26
import com.awesomeapp.eventuser.Model324_28
import com.awesomeapp.eventuser.Activity324_29
import com.awesomeapp.eventuser.Model324_31
import com.awesomeapp.eventuser.Activity324_32
import com.awesomeapp.eventuser.Model324_34
import com.awesomeapp.eventuser.Activity324_35
import com.awesomeapp.eventuser.Model324_37
import com.awesomeapp.eventuser.Activity324_38
import com.awesomeapp.eventuser.Model324_40

@Module
@InstallIn(SingletonComponent::class)
object Module_324 {
    @Provides
    @Singleton
    fun provideRepository324_5(): Repository324_5 {
        return Repository324_5()
    }

    @Provides
    @Singleton
    fun provideApi324_6(): Api324_6 {
        return Api324_6()
    }
}