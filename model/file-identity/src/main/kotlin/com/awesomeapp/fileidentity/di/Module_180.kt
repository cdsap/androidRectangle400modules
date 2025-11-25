package com.awesomeapp.fileidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.fileidentity.Viewmodel180_1
import com.awesomeapp.fileidentity.Activity180_2
import com.awesomeapp.fileidentity.Activity180_3
import com.awesomeapp.fileidentity.Fragment180_4
import com.awesomeapp.fileidentity.Repository180_5
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.fileidentity.Service180_7
import com.awesomeapp.fileidentity.Worker180_8
import com.awesomeapp.fileidentity.Usecase180_9
import com.awesomeapp.fileidentity.Model180_11
import com.awesomeapp.fileidentity.Model180_12
import com.awesomeapp.fileidentity.Activity180_13
import com.awesomeapp.fileidentity.Model180_15
import com.awesomeapp.fileidentity.Activity180_16
import com.awesomeapp.fileidentity.Model180_18
import com.awesomeapp.fileidentity.Activity180_19
import com.awesomeapp.fileidentity.Model180_21
import com.awesomeapp.fileidentity.Activity180_22
import com.awesomeapp.fileidentity.Model180_24
import com.awesomeapp.fileidentity.Activity180_25
import com.awesomeapp.fileidentity.Model180_27
import com.awesomeapp.fileidentity.Activity180_28
import com.awesomeapp.fileidentity.Model180_30
import com.awesomeapp.fileidentity.Activity180_31
import com.awesomeapp.fileidentity.Model180_33
import com.awesomeapp.fileidentity.Activity180_34
import com.awesomeapp.fileidentity.Model180_36
import com.awesomeapp.fileidentity.Activity180_37
import com.awesomeapp.fileidentity.Model180_39
import com.awesomeapp.fileidentity.Activity180_40

@Module
@InstallIn(SingletonComponent::class)
object Module_180 {
    @Provides
    @Singleton
    fun provideRepository180_5(
        api0: Api132_6 = Api132_6(),
        api1: Api156_6 = Api156_6(),
        api2: Api136_6 = Api136_6(),
        api3: Api128_6 = Api128_6(),
        api4: Api152_6 = Api152_6(),
        api5: Api144_6 = Api144_6(),
        api6: Api160_6 = Api160_6()
    ): Repository180_5 {
        return Repository180_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi180_6(): Api180_6 {
        return Api180_6()
    }
}