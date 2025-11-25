package com.awesomeapp.listprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.listprofile.Viewmodel380_1
import com.awesomeapp.listprofile.Activity380_2
import com.awesomeapp.listprofile.Activity380_3
import com.awesomeapp.listprofile.Fragment380_4
import com.awesomeapp.listprofile.Repository380_5
import com.awesomeapp.feedprofile.Api352_6
import com.awesomeapp.listprofile.Api380_6
import com.awesomeapp.listprofile.Service380_7
import com.awesomeapp.listprofile.Worker380_8
import com.awesomeapp.listprofile.Model380_10

@Module
@InstallIn(SingletonComponent::class)
object Module_380 {
    @Provides
    @Singleton
    fun provideRepository380_5(
        api0: Api352_6 = Api352_6()
    ): Repository380_5 {
        return Repository380_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi380_6(): Api380_6 {
        return Api380_6()
    }
}