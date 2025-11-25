package com.awesomeapp.gallerylogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.gallerylogin.Viewmodel144_1
import com.awesomeapp.gallerylogin.Activity144_2
import com.awesomeapp.gallerylogin.Activity144_3
import com.awesomeapp.gallerylogin.Fragment144_4
import com.awesomeapp.gallerylogin.Repository144_5
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.messagelogin.Api116_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.gallerylogin.Usecase144_7
import com.awesomeapp.gallerylogin.Model144_9
import com.awesomeapp.gallerylogin.Model144_10
import com.awesomeapp.gallerylogin.Activity144_11
import com.awesomeapp.gallerylogin.Model144_13
import com.awesomeapp.gallerylogin.Activity144_14
import com.awesomeapp.gallerylogin.Model144_16
import com.awesomeapp.gallerylogin.Activity144_17
import com.awesomeapp.gallerylogin.Model144_19
import com.awesomeapp.gallerylogin.Activity144_20
import com.awesomeapp.gallerylogin.Model144_22
import com.awesomeapp.gallerylogin.Activity144_23
import com.awesomeapp.gallerylogin.Model144_25
import com.awesomeapp.gallerylogin.Activity144_26
import com.awesomeapp.gallerylogin.Model144_28
import com.awesomeapp.gallerylogin.Activity144_29
import com.awesomeapp.gallerylogin.Model144_31
import com.awesomeapp.gallerylogin.Activity144_32
import com.awesomeapp.gallerylogin.Model144_34
import com.awesomeapp.gallerylogin.Activity144_35
import com.awesomeapp.gallerylogin.Model144_37
import com.awesomeapp.gallerylogin.Activity144_38
import com.awesomeapp.gallerylogin.Model144_40
import com.awesomeapp.gallerylogin.Activity144_41
import com.awesomeapp.gallerylogin.Model144_43

@Module
@InstallIn(SingletonComponent::class)
object Module_144 {
    @Provides
    @Singleton
    fun provideRepository144_5(
        api0: Api92_6 = Api92_6(),
        api1: Api104_6 = Api104_6(),
        api2: Api116_6 = Api116_6(),
        api3: Api108_6 = Api108_6(),
        api4: Api84_6 = Api84_6(),
        api5: Api120_6 = Api120_6()
    ): Repository144_5 {
        return Repository144_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi144_6(): Api144_6 {
        return Api144_6()
    }
}