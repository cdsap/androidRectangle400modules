package com.awesomeapp.groupprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.groupprofile.Viewmodel360_1
import com.awesomeapp.groupprofile.Activity360_2
import com.awesomeapp.groupprofile.Activity360_3
import com.awesomeapp.groupprofile.Fragment360_4
import com.awesomeapp.groupprofile.Repository360_5
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.groupprofile.Api360_6
import com.awesomeapp.groupprofile.Service360_7
import com.awesomeapp.groupprofile.Worker360_8

@Module
@InstallIn(SingletonComponent::class)
object Module_360 {
    @Provides
    @Singleton
    fun provideRepository360_5(
        api0: Api300_6 = Api300_6(),
        api1: Api304_6 = Api304_6(),
        api2: Api296_6 = Api296_6()
    ): Repository360_5 {
        return Repository360_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi360_6(): Api360_6 {
        return Api360_6()
    }
}