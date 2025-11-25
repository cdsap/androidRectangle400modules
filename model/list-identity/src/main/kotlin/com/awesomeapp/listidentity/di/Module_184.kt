package com.awesomeapp.listidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.listidentity.Viewmodel184_1
import com.awesomeapp.listidentity.Activity184_2
import com.awesomeapp.listidentity.Activity184_3
import com.awesomeapp.listidentity.Fragment184_4
import com.awesomeapp.listidentity.Repository184_5
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.listidentity.Model184_8
import com.awesomeapp.listidentity.Model184_9
import com.awesomeapp.listidentity.Activity184_10
import com.awesomeapp.listidentity.Model184_12
import com.awesomeapp.listidentity.Activity184_13
import com.awesomeapp.listidentity.Model184_15
import com.awesomeapp.listidentity.Activity184_16
import com.awesomeapp.listidentity.Model184_18
import com.awesomeapp.listidentity.Activity184_19
import com.awesomeapp.listidentity.Model184_21
import com.awesomeapp.listidentity.Activity184_22
import com.awesomeapp.listidentity.Model184_24
import com.awesomeapp.listidentity.Activity184_25
import com.awesomeapp.listidentity.Model184_27
import com.awesomeapp.listidentity.Activity184_28
import com.awesomeapp.listidentity.Model184_30
import com.awesomeapp.listidentity.Activity184_31
import com.awesomeapp.listidentity.Model184_33
import com.awesomeapp.listidentity.Activity184_34
import com.awesomeapp.listidentity.Model184_36
import com.awesomeapp.listidentity.Activity184_37
import com.awesomeapp.listidentity.Model184_39
import com.awesomeapp.listidentity.Activity184_40
import com.awesomeapp.listidentity.Model184_42
import com.awesomeapp.listidentity.Activity184_43
import com.awesomeapp.listidentity.Model184_45
import com.awesomeapp.listidentity.Activity184_46
import com.awesomeapp.listidentity.Model184_48

@Module
@InstallIn(SingletonComponent::class)
object Module_184 {
    @Provides
    @Singleton
    fun provideRepository184_5(): Repository184_5 {
        return Repository184_5()
    }

    @Provides
    @Singleton
    fun provideApi184_6(): Api184_6 {
        return Api184_6()
    }
}