package com.awesomeapp.playlistprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.playlistprofile.Viewmodel392_1
import com.awesomeapp.playlistprofile.Activity392_2
import com.awesomeapp.playlistprofile.Activity392_3
import com.awesomeapp.playlistprofile.Fragment392_4
import com.awesomeapp.playlistprofile.Repository392_5
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.pushprofile.Api344_6
import com.awesomeapp.locationprofile.Api356_6
import com.awesomeapp.galleryuser.Api340_6
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.articleuser.Api336_6
import com.awesomeapp.feedprofile.Api352_6
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.playlistprofile.Api392_6
import com.awesomeapp.playlistprofile.Model392_8
import com.awesomeapp.playlistprofile.Model392_9
import com.awesomeapp.playlistprofile.Activity392_10
import com.awesomeapp.playlistprofile.Model392_12
import com.awesomeapp.playlistprofile.Activity392_13
import com.awesomeapp.playlistprofile.Model392_15
import com.awesomeapp.playlistprofile.Activity392_16
import com.awesomeapp.playlistprofile.Model392_18
import com.awesomeapp.playlistprofile.Activity392_19
import com.awesomeapp.playlistprofile.Model392_21
import com.awesomeapp.playlistprofile.Activity392_22
import com.awesomeapp.playlistprofile.Model392_24
import com.awesomeapp.playlistprofile.Activity392_25
import com.awesomeapp.playlistprofile.Model392_27
import com.awesomeapp.playlistprofile.Activity392_28
import com.awesomeapp.playlistprofile.Model392_30
import com.awesomeapp.playlistprofile.Activity392_31
import com.awesomeapp.playlistprofile.Model392_33
import com.awesomeapp.playlistprofile.Activity392_34
import com.awesomeapp.playlistprofile.Model392_36
import com.awesomeapp.playlistprofile.Activity392_37

@Module
@InstallIn(SingletonComponent::class)
object Module_392 {
    @Provides
    @Singleton
    fun provideRepository392_5(
        api0: Api332_6 = Api332_6(),
        api1: Api344_6 = Api344_6(),
        api2: Api356_6 = Api356_6(),
        api3: Api340_6 = Api340_6(),
        api4: Api324_6 = Api324_6(),
        api5: Api336_6 = Api336_6(),
        api6: Api352_6 = Api352_6(),
        api7: Api328_6 = Api328_6()
    ): Repository392_5 {
        return Repository392_5(api0, 
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
    fun provideApi392_6(): Api392_6 {
        return Api392_6()
    }
}