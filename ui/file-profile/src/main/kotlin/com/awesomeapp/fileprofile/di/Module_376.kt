package com.awesomeapp.fileprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.fileprofile.Viewmodel376_1
import com.awesomeapp.fileprofile.Activity376_2
import com.awesomeapp.fileprofile.Activity376_3
import com.awesomeapp.fileprofile.Fragment376_4
import com.awesomeapp.fileprofile.Repository376_5
import com.awesomeapp.locationprofile.Api356_6
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.groupprofile.Api360_6
import com.awesomeapp.galleryuser.Api340_6
import com.awesomeapp.fileprofile.Api376_6
import com.awesomeapp.fileprofile.Model376_8
import com.awesomeapp.fileprofile.Model376_9
import com.awesomeapp.fileprofile.Activity376_10
import com.awesomeapp.fileprofile.Model376_12
import com.awesomeapp.fileprofile.Activity376_13
import com.awesomeapp.fileprofile.Model376_15
import com.awesomeapp.fileprofile.Activity376_16
import com.awesomeapp.fileprofile.Model376_18
import com.awesomeapp.fileprofile.Activity376_19
import com.awesomeapp.fileprofile.Model376_21
import com.awesomeapp.fileprofile.Activity376_22
import com.awesomeapp.fileprofile.Model376_24
import com.awesomeapp.fileprofile.Activity376_25

@Module
@InstallIn(SingletonComponent::class)
object Module_376 {
    @Provides
    @Singleton
    fun provideRepository376_5(
        api0: Api356_6 = Api356_6(),
        api1: Api324_6 = Api324_6(),
        api2: Api332_6 = Api332_6(),
        api3: Api360_6 = Api360_6(),
        api4: Api340_6 = Api340_6()
    ): Repository376_5 {
        return Repository376_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi376_6(): Api376_6 {
        return Api376_6()
    }
}