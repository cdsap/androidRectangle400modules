package com.awesomeapp.identityfeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.identityfeed.Viewmodel396_1
import com.awesomeapp.identityfeed.Activity396_2
import com.awesomeapp.identityfeed.Activity396_3
import com.awesomeapp.identityfeed.Fragment396_4
import com.awesomeapp.identityfeed.Repository396_5
import com.awesomeapp.locationprofile.Api356_6
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.galleryuser.Api340_6
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.articleuser.Api336_6
import com.awesomeapp.pushprofile.Api344_6
import com.awesomeapp.identityfeed.Api396_6
import com.awesomeapp.identityfeed.Usecase396_7
import com.awesomeapp.identityfeed.Model396_9
import com.awesomeapp.identityfeed.Model396_10
import com.awesomeapp.identityfeed.Activity396_11
import com.awesomeapp.identityfeed.Model396_13
import com.awesomeapp.identityfeed.Activity396_14
import com.awesomeapp.identityfeed.Model396_16
import com.awesomeapp.identityfeed.Activity396_17
import com.awesomeapp.identityfeed.Model396_19
import com.awesomeapp.identityfeed.Activity396_20
import com.awesomeapp.identityfeed.Model396_22
import com.awesomeapp.identityfeed.Activity396_23
import com.awesomeapp.identityfeed.Model396_25
import com.awesomeapp.identityfeed.Activity396_26
import com.awesomeapp.identityfeed.Model396_28
import com.awesomeapp.identityfeed.Activity396_29
import com.awesomeapp.identityfeed.Model396_31
import com.awesomeapp.identityfeed.Activity396_32
import com.awesomeapp.identityfeed.Model396_34
import com.awesomeapp.identityfeed.Activity396_35
import com.awesomeapp.identityfeed.Model396_37
import com.awesomeapp.identityfeed.Activity396_38
import com.awesomeapp.identityfeed.Model396_40
import com.awesomeapp.identityfeed.Activity396_41
import com.awesomeapp.identityfeed.Model396_43
import com.awesomeapp.identityfeed.Activity396_44

@Module
@InstallIn(SingletonComponent::class)
object Module_396 {
    @Provides
    @Singleton
    fun provideRepository396_5(
        api0: Api356_6 = Api356_6(),
        api1: Api328_6 = Api328_6(),
        api2: Api340_6 = Api340_6(),
        api3: Api348_6 = Api348_6(),
        api4: Api336_6 = Api336_6(),
        api5: Api344_6 = Api344_6()
    ): Repository396_5 {
        return Repository396_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi396_6(): Api396_6 {
        return Api396_6()
    }
}