package com.awesomeapp.logidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.logidentity.Viewmodel172_1
import com.awesomeapp.logidentity.Activity172_2
import com.awesomeapp.logidentity.Activity172_3
import com.awesomeapp.logidentity.Fragment172_4
import com.awesomeapp.logidentity.Repository172_5
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.logidentity.Model172_8
import com.awesomeapp.logidentity.Model172_9
import com.awesomeapp.logidentity.Activity172_10
import com.awesomeapp.logidentity.Model172_12
import com.awesomeapp.logidentity.Activity172_13
import com.awesomeapp.logidentity.Model172_15
import com.awesomeapp.logidentity.Activity172_16
import com.awesomeapp.logidentity.Model172_18
import com.awesomeapp.logidentity.Activity172_19
import com.awesomeapp.logidentity.Model172_21
import com.awesomeapp.logidentity.Activity172_22
import com.awesomeapp.logidentity.Model172_24
import com.awesomeapp.logidentity.Activity172_25
import com.awesomeapp.logidentity.Model172_27
import com.awesomeapp.logidentity.Activity172_28
import com.awesomeapp.logidentity.Model172_30
import com.awesomeapp.logidentity.Activity172_31
import com.awesomeapp.logidentity.Model172_33

@Module
@InstallIn(SingletonComponent::class)
object Module_172 {
    @Provides
    @Singleton
    fun provideRepository172_5(
        api0: Api128_6 = Api128_6(),
        api1: Api144_6 = Api144_6(),
        api2: Api124_6 = Api124_6(),
        api3: Api160_6 = Api160_6(),
        api4: Api156_6 = Api156_6(),
        api5: Api140_6 = Api140_6()
    ): Repository172_5 {
        return Repository172_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi172_6(): Api172_6 {
        return Api172_6()
    }
}