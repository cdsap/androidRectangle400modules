package com.awesomeapp.galleryuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.galleryuser.Viewmodel340_1
import com.awesomeapp.galleryuser.Activity340_2
import com.awesomeapp.galleryuser.Activity340_3
import com.awesomeapp.galleryuser.Fragment340_4
import com.awesomeapp.galleryuser.Repository340_5
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.galleryuser.Api340_6
import com.awesomeapp.galleryuser.Service340_7
import com.awesomeapp.galleryuser.Worker340_8
import com.awesomeapp.galleryuser.Model340_10
import com.awesomeapp.galleryuser.Model340_11
import com.awesomeapp.galleryuser.Activity340_12

@Module
@InstallIn(SingletonComponent::class)
object Module_340 {
    @Provides
    @Singleton
    fun provideRepository340_5(
        api0: Api312_6 = Api312_6(),
        api1: Api300_6 = Api300_6(),
        api2: Api320_6 = Api320_6(),
        api3: Api284_6 = Api284_6(),
        api4: Api288_6 = Api288_6(),
        api5: Api296_6 = Api296_6(),
        api6: Api316_6 = Api316_6(),
        api7: Api292_6 = Api292_6(),
        api8: Api308_6 = Api308_6(),
        api9: Api304_6 = Api304_6()
    ): Repository340_5 {
        return Repository340_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9)
    }

    @Provides
    @Singleton
    fun provideApi340_6(): Api340_6 {
        return Api340_6()
    }
}