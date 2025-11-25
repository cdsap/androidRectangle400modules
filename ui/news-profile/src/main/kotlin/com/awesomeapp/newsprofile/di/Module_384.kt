package com.awesomeapp.newsprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.newsprofile.Viewmodel384_1
import com.awesomeapp.newsprofile.Activity384_2
import com.awesomeapp.newsprofile.Activity384_3
import com.awesomeapp.newsprofile.Fragment384_4
import com.awesomeapp.newsprofile.Repository384_5
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.locationprofile.Api356_6
import com.awesomeapp.pushprofile.Api344_6
import com.awesomeapp.groupprofile.Api360_6
import com.awesomeapp.feedprofile.Api352_6
import com.awesomeapp.newsprofile.Api384_6
import com.awesomeapp.newsprofile.Usecase384_7
import com.awesomeapp.newsprofile.Model384_9
import com.awesomeapp.newsprofile.Model384_10
import com.awesomeapp.newsprofile.Activity384_11
import com.awesomeapp.newsprofile.Model384_13
import com.awesomeapp.newsprofile.Activity384_14
import com.awesomeapp.newsprofile.Model384_16
import com.awesomeapp.newsprofile.Activity384_17
import com.awesomeapp.newsprofile.Model384_19
import com.awesomeapp.newsprofile.Activity384_20
import com.awesomeapp.newsprofile.Model384_22
import com.awesomeapp.newsprofile.Activity384_23
import com.awesomeapp.newsprofile.Model384_25
import com.awesomeapp.newsprofile.Activity384_26
import com.awesomeapp.newsprofile.Model384_28
import com.awesomeapp.newsprofile.Activity384_29
import com.awesomeapp.newsprofile.Model384_31
import com.awesomeapp.newsprofile.Activity384_32
import com.awesomeapp.newsprofile.Model384_34
import com.awesomeapp.newsprofile.Activity384_35
import com.awesomeapp.newsprofile.Model384_37
import com.awesomeapp.newsprofile.Activity384_38
import com.awesomeapp.newsprofile.Model384_40
import com.awesomeapp.newsprofile.Activity384_41

@Module
@InstallIn(SingletonComponent::class)
object Module_384 {
    @Provides
    @Singleton
    fun provideRepository384_5(
        api0: Api324_6 = Api324_6(),
        api1: Api328_6 = Api328_6(),
        api2: Api356_6 = Api356_6(),
        api3: Api344_6 = Api344_6(),
        api4: Api360_6 = Api360_6(),
        api5: Api352_6 = Api352_6()
    ): Repository384_5 {
        return Repository384_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi384_6(): Api384_6 {
        return Api384_6()
    }
}