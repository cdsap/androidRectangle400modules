package com.awesomeapp.audio.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.audio.Viewmodel48_1
import com.awesomeapp.audio.Activity48_2
import com.awesomeapp.audio.Activity48_3
import com.awesomeapp.audio.Fragment48_4
import com.awesomeapp.audio.Repository48_5
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.audio.Usecase48_7
import com.awesomeapp.audio.Model48_9
import com.awesomeapp.audio.Model48_10
import com.awesomeapp.audio.Activity48_11
import com.awesomeapp.audio.Model48_13
import com.awesomeapp.audio.Activity48_14
import com.awesomeapp.audio.Model48_16
import com.awesomeapp.audio.Activity48_17
import com.awesomeapp.audio.Model48_19
import com.awesomeapp.audio.Activity48_20
import com.awesomeapp.audio.Model48_22
import com.awesomeapp.audio.Activity48_23
import com.awesomeapp.audio.Model48_25
import com.awesomeapp.audio.Activity48_26
import com.awesomeapp.audio.Model48_28
import com.awesomeapp.audio.Activity48_29
import com.awesomeapp.audio.Model48_31

@Module
@InstallIn(SingletonComponent::class)
object Module_48 {
    @Provides
    @Singleton
    fun provideRepository48_5(
        api0: Api40_6 = Api40_6(),
        api1: Api12_6 = Api12_6(),
        api2: Api4_6 = Api4_6(),
        api3: Api36_6 = Api36_6(),
        api4: Api20_6 = Api20_6(),
        api5: Api32_6 = Api32_6(),
        api6: Api24_6 = Api24_6()
    ): Repository48_5 {
        return Repository48_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi48_6(): Api48_6 {
        return Api48_6()
    }
}