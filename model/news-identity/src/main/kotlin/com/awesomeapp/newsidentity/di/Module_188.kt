package com.awesomeapp.newsidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.newsidentity.Viewmodel188_1
import com.awesomeapp.newsidentity.Activity188_2
import com.awesomeapp.newsidentity.Activity188_3
import com.awesomeapp.newsidentity.Fragment188_4
import com.awesomeapp.newsidentity.Repository188_5
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.newsidentity.Model188_8
import com.awesomeapp.newsidentity.Model188_9
import com.awesomeapp.newsidentity.Activity188_10
import com.awesomeapp.newsidentity.Model188_12
import com.awesomeapp.newsidentity.Activity188_13
import com.awesomeapp.newsidentity.Model188_15
import com.awesomeapp.newsidentity.Activity188_16
import com.awesomeapp.newsidentity.Model188_18
import com.awesomeapp.newsidentity.Activity188_19
import com.awesomeapp.newsidentity.Model188_21
import com.awesomeapp.newsidentity.Activity188_22
import com.awesomeapp.newsidentity.Model188_24
import com.awesomeapp.newsidentity.Activity188_25
import com.awesomeapp.newsidentity.Model188_27
import com.awesomeapp.newsidentity.Activity188_28
import com.awesomeapp.newsidentity.Model188_30
import com.awesomeapp.newsidentity.Activity188_31

@Module
@InstallIn(SingletonComponent::class)
object Module_188 {
    @Provides
    @Singleton
    fun provideRepository188_5(
        api0: Api152_6 = Api152_6(),
        api1: Api140_6 = Api140_6(),
        api2: Api136_6 = Api136_6()
    ): Repository188_5 {
        return Repository188_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi188_6(): Api188_6 {
        return Api188_6()
    }
}