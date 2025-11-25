package com.awesomeapp.analyticscontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.analyticscontact.Viewmodel72_1
import com.awesomeapp.analyticscontact.Activity72_2
import com.awesomeapp.analyticscontact.Activity72_3
import com.awesomeapp.analyticscontact.Fragment72_4
import com.awesomeapp.analyticscontact.Repository72_5
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.analyticscontact.Usecase72_7
import com.awesomeapp.analyticscontact.Model72_9
import com.awesomeapp.analyticscontact.Model72_10
import com.awesomeapp.analyticscontact.Activity72_11

@Module
@InstallIn(SingletonComponent::class)
object Module_72 {
    @Provides
    @Singleton
    fun provideRepository72_5(
        api0: Api4_6 = Api4_6(),
        api1: Api16_6 = Api16_6(),
        api2: Api20_6 = Api20_6(),
        api3: Api24_6 = Api24_6(),
        api4: Api36_6 = Api36_6(),
        api5: Api12_6 = Api12_6(),
        api6: Api8_6 = Api8_6()
    ): Repository72_5 {
        return Repository72_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi72_6(): Api72_6 {
        return Api72_6()
    }
}