package com.awesomeapp.usercontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.usercontact.Viewmodel56_1
import com.awesomeapp.usercontact.Activity56_2
import com.awesomeapp.usercontact.Activity56_3
import com.awesomeapp.usercontact.Fragment56_4
import com.awesomeapp.usercontact.Repository56_5
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.usercontact.Model56_7

@Module
@InstallIn(SingletonComponent::class)
object Module_56 {
    @Provides
    @Singleton
    fun provideRepository56_5(
        api0: Api8_6 = Api8_6(),
        api1: Api12_6 = Api12_6(),
        api2: Api28_6 = Api28_6(),
        api3: Api4_6 = Api4_6(),
        api4: Api40_6 = Api40_6(),
        api5: Api36_6 = Api36_6(),
        api6: Api24_6 = Api24_6(),
        api7: Api16_6 = Api16_6()
    ): Repository56_5 {
        return Repository56_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7)
    }

    @Provides
    @Singleton
    fun provideApi56_6(): Api56_6 {
        return Api56_6()
    }
}