package com.awesomeapp.accountprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.accountprofile.Viewmodel364_1
import com.awesomeapp.accountprofile.Activity364_2
import com.awesomeapp.accountprofile.Activity364_3
import com.awesomeapp.accountprofile.Fragment364_4
import com.awesomeapp.accountprofile.Repository364_5
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.groupprofile.Api360_6
import com.awesomeapp.feedprofile.Api352_6
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.articleuser.Api336_6
import com.awesomeapp.pushprofile.Api344_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.accountprofile.Api364_6
import com.awesomeapp.accountprofile.Model364_8
import com.awesomeapp.accountprofile.Model364_9
import com.awesomeapp.accountprofile.Activity364_10
import com.awesomeapp.accountprofile.Model364_12
import com.awesomeapp.accountprofile.Activity364_13
import com.awesomeapp.accountprofile.Model364_15
import com.awesomeapp.accountprofile.Activity364_16
import com.awesomeapp.accountprofile.Model364_18
import com.awesomeapp.accountprofile.Activity364_19
import com.awesomeapp.accountprofile.Model364_21
import com.awesomeapp.accountprofile.Activity364_22
import com.awesomeapp.accountprofile.Model364_24
import com.awesomeapp.accountprofile.Activity364_25
import com.awesomeapp.accountprofile.Model364_27
import com.awesomeapp.accountprofile.Activity364_28
import com.awesomeapp.accountprofile.Model364_30
import com.awesomeapp.accountprofile.Activity364_31
import com.awesomeapp.accountprofile.Model364_33
import com.awesomeapp.accountprofile.Activity364_34
import com.awesomeapp.accountprofile.Model364_36
import com.awesomeapp.accountprofile.Activity364_37
import com.awesomeapp.accountprofile.Model364_39
import com.awesomeapp.accountprofile.Activity364_40
import com.awesomeapp.accountprofile.Model364_42

@Module
@InstallIn(SingletonComponent::class)
object Module_364 {
    @Provides
    @Singleton
    fun provideRepository364_5(
        api0: Api348_6 = Api348_6(),
        api1: Api360_6 = Api360_6(),
        api2: Api352_6 = Api352_6(),
        api3: Api324_6 = Api324_6(),
        api4: Api336_6 = Api336_6(),
        api5: Api344_6 = Api344_6(),
        api6: Api332_6 = Api332_6()
    ): Repository364_5 {
        return Repository364_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi364_6(): Api364_6 {
        return Api364_6()
    }
}