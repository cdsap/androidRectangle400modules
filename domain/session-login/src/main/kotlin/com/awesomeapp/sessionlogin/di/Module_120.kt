package com.awesomeapp.sessionlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.sessionlogin.Viewmodel120_1
import com.awesomeapp.sessionlogin.Activity120_2
import com.awesomeapp.sessionlogin.Activity120_3
import com.awesomeapp.sessionlogin.Fragment120_4
import com.awesomeapp.sessionlogin.Repository120_5
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.sessionlogin.Service120_7
import com.awesomeapp.sessionlogin.Worker120_8
import com.awesomeapp.sessionlogin.Usecase120_9
import com.awesomeapp.sessionlogin.Model120_11
import com.awesomeapp.sessionlogin.Model120_12
import com.awesomeapp.sessionlogin.Activity120_13
import com.awesomeapp.sessionlogin.Model120_15
import com.awesomeapp.sessionlogin.Activity120_16
import com.awesomeapp.sessionlogin.Model120_18
import com.awesomeapp.sessionlogin.Activity120_19
import com.awesomeapp.sessionlogin.Model120_21
import com.awesomeapp.sessionlogin.Activity120_22
import com.awesomeapp.sessionlogin.Model120_24
import com.awesomeapp.sessionlogin.Activity120_25
import com.awesomeapp.sessionlogin.Model120_27
import com.awesomeapp.sessionlogin.Activity120_28
import com.awesomeapp.sessionlogin.Model120_30
import com.awesomeapp.sessionlogin.Activity120_31

@Module
@InstallIn(SingletonComponent::class)
object Module_120 {
    @Provides
    @Singleton
    fun provideRepository120_5(
        api0: Api72_6 = Api72_6(),
        api1: Api64_6 = Api64_6(),
        api2: Api60_6 = Api60_6(),
        api3: Api48_6 = Api48_6(),
        api4: Api44_6 = Api44_6(),
        api5: Api56_6 = Api56_6(),
        api6: Api76_6 = Api76_6()
    ): Repository120_5 {
        return Repository120_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi120_6(): Api120_6 {
        return Api120_6()
    }
}