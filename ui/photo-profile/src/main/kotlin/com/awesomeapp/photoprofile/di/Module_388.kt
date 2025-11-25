package com.awesomeapp.photoprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.photoprofile.Viewmodel388_1
import com.awesomeapp.photoprofile.Activity388_2
import com.awesomeapp.photoprofile.Activity388_3
import com.awesomeapp.photoprofile.Fragment388_4
import com.awesomeapp.photoprofile.Repository388_5
import com.awesomeapp.groupprofile.Api360_6
import com.awesomeapp.photoprofile.Api388_6
import com.awesomeapp.photoprofile.Model388_8
import com.awesomeapp.photoprofile.Model388_9
import com.awesomeapp.photoprofile.Activity388_10
import com.awesomeapp.photoprofile.Model388_12
import com.awesomeapp.photoprofile.Activity388_13
import com.awesomeapp.photoprofile.Model388_15
import com.awesomeapp.photoprofile.Activity388_16
import com.awesomeapp.photoprofile.Model388_18
import com.awesomeapp.photoprofile.Activity388_19
import com.awesomeapp.photoprofile.Model388_21
import com.awesomeapp.photoprofile.Activity388_22
import com.awesomeapp.photoprofile.Model388_24
import com.awesomeapp.photoprofile.Activity388_25
import com.awesomeapp.photoprofile.Model388_27
import com.awesomeapp.photoprofile.Activity388_28

@Module
@InstallIn(SingletonComponent::class)
object Module_388 {
    @Provides
    @Singleton
    fun provideRepository388_5(
        api0: Api360_6 = Api360_6()
    ): Repository388_5 {
        return Repository388_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi388_6(): Api388_6 {
        return Api388_6()
    }
}