package com.awesomeapp.checkoutprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.checkoutprofile.Viewmodel348_1
import com.awesomeapp.checkoutprofile.Activity348_2
import com.awesomeapp.checkoutprofile.Activity348_3
import com.awesomeapp.checkoutprofile.Fragment348_4
import com.awesomeapp.checkoutprofile.Repository348_5
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.checkoutprofile.Usecase348_7
import com.awesomeapp.checkoutprofile.Model348_9
import com.awesomeapp.checkoutprofile.Model348_10
import com.awesomeapp.checkoutprofile.Activity348_11
import com.awesomeapp.checkoutprofile.Model348_13
import com.awesomeapp.checkoutprofile.Activity348_14
import com.awesomeapp.checkoutprofile.Model348_16
import com.awesomeapp.checkoutprofile.Activity348_17
import com.awesomeapp.checkoutprofile.Model348_19
import com.awesomeapp.checkoutprofile.Activity348_20
import com.awesomeapp.checkoutprofile.Model348_22
import com.awesomeapp.checkoutprofile.Activity348_23
import com.awesomeapp.checkoutprofile.Model348_25
import com.awesomeapp.checkoutprofile.Activity348_26
import com.awesomeapp.checkoutprofile.Model348_28
import com.awesomeapp.checkoutprofile.Activity348_29
import com.awesomeapp.checkoutprofile.Model348_31
import com.awesomeapp.checkoutprofile.Activity348_32
import com.awesomeapp.checkoutprofile.Model348_34
import com.awesomeapp.checkoutprofile.Activity348_35
import com.awesomeapp.checkoutprofile.Model348_37
import com.awesomeapp.checkoutprofile.Activity348_38
import com.awesomeapp.checkoutprofile.Model348_40
import com.awesomeapp.checkoutprofile.Activity348_41
import com.awesomeapp.checkoutprofile.Model348_43

@Module
@InstallIn(SingletonComponent::class)
object Module_348 {
    @Provides
    @Singleton
    fun provideRepository348_5(
        api0: Api308_6 = Api308_6(),
        api1: Api288_6 = Api288_6(),
        api2: Api296_6 = Api296_6(),
        api3: Api320_6 = Api320_6(),
        api4: Api316_6 = Api316_6(),
        api5: Api292_6 = Api292_6()
    ): Repository348_5 {
        return Repository348_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi348_6(): Api348_6 {
        return Api348_6()
    }
}