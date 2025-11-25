package com.awesomeapp.locationprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.locationprofile.Viewmodel356_1
import com.awesomeapp.locationprofile.Activity356_2
import com.awesomeapp.locationprofile.Activity356_3
import com.awesomeapp.locationprofile.Fragment356_4
import com.awesomeapp.locationprofile.Repository356_5
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.locationprofile.Api356_6
import com.awesomeapp.locationprofile.Model356_8
import com.awesomeapp.locationprofile.Model356_9
import com.awesomeapp.locationprofile.Activity356_10
import com.awesomeapp.locationprofile.Model356_12
import com.awesomeapp.locationprofile.Activity356_13
import com.awesomeapp.locationprofile.Model356_15
import com.awesomeapp.locationprofile.Activity356_16
import com.awesomeapp.locationprofile.Model356_18
import com.awesomeapp.locationprofile.Activity356_19
import com.awesomeapp.locationprofile.Model356_21
import com.awesomeapp.locationprofile.Activity356_22
import com.awesomeapp.locationprofile.Model356_24
import com.awesomeapp.locationprofile.Activity356_25

@Module
@InstallIn(SingletonComponent::class)
object Module_356 {
    @Provides
    @Singleton
    fun provideRepository356_5(
        api0: Api312_6 = Api312_6(),
        api1: Api316_6 = Api316_6(),
        api2: Api320_6 = Api320_6(),
        api3: Api288_6 = Api288_6()
    ): Repository356_5 {
        return Repository356_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi356_6(): Api356_6 {
        return Api356_6()
    }
}