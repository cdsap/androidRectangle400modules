package com.awesomeapp.profilefeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.profilefeed.Viewmodel400_1
import com.awesomeapp.profilefeed.Activity400_2
import com.awesomeapp.profilefeed.Activity400_3
import com.awesomeapp.profilefeed.Fragment400_4
import com.awesomeapp.profilefeed.Repository400_5
import com.awesomeapp.galleryuser.Api340_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.articleuser.Api336_6
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.groupprofile.Api360_6
import com.awesomeapp.pushprofile.Api344_6
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.profilefeed.Api400_6
import com.awesomeapp.profilefeed.Service400_7
import com.awesomeapp.profilefeed.Worker400_8
import com.awesomeapp.profilefeed.Model400_10
import com.awesomeapp.profilefeed.Model400_11
import com.awesomeapp.profilefeed.Activity400_12
import com.awesomeapp.profilefeed.Model400_14
import com.awesomeapp.profilefeed.Activity400_15

@Module
@InstallIn(SingletonComponent::class)
object Module_400 {
    @Provides
    @Singleton
    fun provideRepository400_5(
        api0: Api340_6 = Api340_6(),
        api1: Api332_6 = Api332_6(),
        api2: Api336_6 = Api336_6(),
        api3: Api324_6 = Api324_6(),
        api4: Api328_6 = Api328_6(),
        api5: Api360_6 = Api360_6(),
        api6: Api344_6 = Api344_6(),
        api7: Api348_6 = Api348_6()
    ): Repository400_5 {
        return Repository400_5(api0, 
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
    fun provideApi400_6(): Api400_6 {
        return Api400_6()
    }
}