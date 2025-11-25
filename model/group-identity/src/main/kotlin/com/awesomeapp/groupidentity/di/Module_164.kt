package com.awesomeapp.groupidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.groupidentity.Viewmodel164_1
import com.awesomeapp.groupidentity.Activity164_2
import com.awesomeapp.groupidentity.Activity164_3
import com.awesomeapp.groupidentity.Fragment164_4
import com.awesomeapp.groupidentity.Repository164_5
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.groupidentity.Model164_8
import com.awesomeapp.groupidentity.Model164_9
import com.awesomeapp.groupidentity.Activity164_10
import com.awesomeapp.groupidentity.Model164_12
import com.awesomeapp.groupidentity.Activity164_13
import com.awesomeapp.groupidentity.Model164_15
import com.awesomeapp.groupidentity.Activity164_16
import com.awesomeapp.groupidentity.Model164_18

@Module
@InstallIn(SingletonComponent::class)
object Module_164 {
    @Provides
    @Singleton
    fun provideRepository164_5(
        api0: Api144_6 = Api144_6(),
        api1: Api136_6 = Api136_6(),
        api2: Api148_6 = Api148_6(),
        api3: Api152_6 = Api152_6(),
        api4: Api156_6 = Api156_6(),
        api5: Api160_6 = Api160_6(),
        api6: Api128_6 = Api128_6(),
        api7: Api124_6 = Api124_6(),
        api8: Api140_6 = Api140_6()
    ): Repository164_5 {
        return Repository164_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8)
    }

    @Provides
    @Singleton
    fun provideApi164_6(): Api164_6 {
        return Api164_6()
    }
}