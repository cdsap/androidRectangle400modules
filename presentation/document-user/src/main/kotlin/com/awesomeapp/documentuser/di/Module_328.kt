package com.awesomeapp.documentuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.documentuser.Viewmodel328_1
import com.awesomeapp.documentuser.Activity328_2
import com.awesomeapp.documentuser.Activity328_3
import com.awesomeapp.documentuser.Fragment328_4
import com.awesomeapp.documentuser.Repository328_5
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.documentuser.Model328_8
import com.awesomeapp.documentuser.Model328_9
import com.awesomeapp.documentuser.Activity328_10
import com.awesomeapp.documentuser.Model328_12
import com.awesomeapp.documentuser.Activity328_13
import com.awesomeapp.documentuser.Model328_15
import com.awesomeapp.documentuser.Activity328_16
import com.awesomeapp.documentuser.Model328_18
import com.awesomeapp.documentuser.Activity328_19
import com.awesomeapp.documentuser.Model328_21
import com.awesomeapp.documentuser.Activity328_22
import com.awesomeapp.documentuser.Model328_24
import com.awesomeapp.documentuser.Activity328_25
import com.awesomeapp.documentuser.Model328_27
import com.awesomeapp.documentuser.Activity328_28
import com.awesomeapp.documentuser.Model328_30
import com.awesomeapp.documentuser.Activity328_31
import com.awesomeapp.documentuser.Model328_33

@Module
@InstallIn(SingletonComponent::class)
object Module_328 {
    @Provides
    @Singleton
    fun provideRepository328_5(
        api0: Api288_6 = Api288_6(),
        api1: Api300_6 = Api300_6(),
        api2: Api312_6 = Api312_6(),
        api3: Api304_6 = Api304_6()
    ): Repository328_5 {
        return Repository328_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi328_6(): Api328_6 {
        return Api328_6()
    }
}