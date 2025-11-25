package com.awesomeapp.feedprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.feedprofile.Viewmodel352_1
import com.awesomeapp.feedprofile.Activity352_2
import com.awesomeapp.feedprofile.Activity352_3
import com.awesomeapp.feedprofile.Fragment352_4
import com.awesomeapp.feedprofile.Repository352_5
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.feedprofile.Api352_6
import com.awesomeapp.feedprofile.Model352_8
import com.awesomeapp.feedprofile.Model352_9
import com.awesomeapp.feedprofile.Activity352_10
import com.awesomeapp.feedprofile.Model352_12
import com.awesomeapp.feedprofile.Activity352_13
import com.awesomeapp.feedprofile.Model352_15
import com.awesomeapp.feedprofile.Activity352_16
import com.awesomeapp.feedprofile.Model352_18
import com.awesomeapp.feedprofile.Activity352_19
import com.awesomeapp.feedprofile.Model352_21
import com.awesomeapp.feedprofile.Activity352_22
import com.awesomeapp.feedprofile.Model352_24
import com.awesomeapp.feedprofile.Activity352_25
import com.awesomeapp.feedprofile.Model352_27
import com.awesomeapp.feedprofile.Activity352_28
import com.awesomeapp.feedprofile.Model352_30
import com.awesomeapp.feedprofile.Activity352_31
import com.awesomeapp.feedprofile.Model352_33
import com.awesomeapp.feedprofile.Activity352_34
import com.awesomeapp.feedprofile.Model352_36
import com.awesomeapp.feedprofile.Activity352_37
import com.awesomeapp.feedprofile.Model352_39
import com.awesomeapp.feedprofile.Activity352_40
import com.awesomeapp.feedprofile.Model352_42
import com.awesomeapp.feedprofile.Activity352_43

@Module
@InstallIn(SingletonComponent::class)
object Module_352 {
    @Provides
    @Singleton
    fun provideRepository352_5(
        api0: Api304_6 = Api304_6(),
        api1: Api312_6 = Api312_6(),
        api2: Api288_6 = Api288_6(),
        api3: Api316_6 = Api316_6(),
        api4: Api308_6 = Api308_6(),
        api5: Api300_6 = Api300_6(),
        api6: Api284_6 = Api284_6(),
        api7: Api292_6 = Api292_6(),
        api8: Api320_6 = Api320_6(),
        api9: Api296_6 = Api296_6()
    ): Repository352_5 {
        return Repository352_5(api0, 
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
    fun provideApi352_6(): Api352_6 {
        return Api352_6()
    }
}