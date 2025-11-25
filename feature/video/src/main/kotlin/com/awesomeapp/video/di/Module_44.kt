package com.awesomeapp.video.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.video.Viewmodel44_1
import com.awesomeapp.video.Activity44_2
import com.awesomeapp.video.Activity44_3
import com.awesomeapp.video.Fragment44_4
import com.awesomeapp.video.Repository44_5
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.video.Model44_8
import com.awesomeapp.video.Model44_9
import com.awesomeapp.video.Activity44_10
import com.awesomeapp.video.Model44_12
import com.awesomeapp.video.Activity44_13
import com.awesomeapp.video.Model44_15
import com.awesomeapp.video.Activity44_16
import com.awesomeapp.video.Model44_18
import com.awesomeapp.video.Activity44_19
import com.awesomeapp.video.Model44_21
import com.awesomeapp.video.Activity44_22
import com.awesomeapp.video.Model44_24
import com.awesomeapp.video.Activity44_25
import com.awesomeapp.video.Model44_27
import com.awesomeapp.video.Activity44_28
import com.awesomeapp.video.Model44_30
import com.awesomeapp.video.Activity44_31
import com.awesomeapp.video.Model44_33

@Module
@InstallIn(SingletonComponent::class)
object Module_44 {
    @Provides
    @Singleton
    fun provideRepository44_5(
        api0: Api36_6 = Api36_6(),
        api1: Api12_6 = Api12_6(),
        api2: Api4_6 = Api4_6(),
        api3: Api8_6 = Api8_6(),
        api4: Api20_6 = Api20_6(),
        api5: Api24_6 = Api24_6(),
        api6: Api28_6 = Api28_6(),
        api7: Api40_6 = Api40_6(),
        api8: Api32_6 = Api32_6()
    ): Repository44_5 {
        return Repository44_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8)
    }

    @Provides
    @Singleton
    fun provideApi44_6(): Api44_6 {
        return Api44_6()
    }
}