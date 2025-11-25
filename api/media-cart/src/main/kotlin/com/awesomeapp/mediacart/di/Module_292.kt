package com.awesomeapp.mediacart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.mediacart.Viewmodel292_1
import com.awesomeapp.mediacart.Activity292_2
import com.awesomeapp.mediacart.Activity292_3
import com.awesomeapp.mediacart.Fragment292_4
import com.awesomeapp.mediacart.Repository292_5
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.metriccart.Api272_6
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.mediacart.Model292_8
import com.awesomeapp.mediacart.Model292_9
import com.awesomeapp.mediacart.Activity292_10
import com.awesomeapp.mediacart.Model292_12
import com.awesomeapp.mediacart.Activity292_13
import com.awesomeapp.mediacart.Model292_15
import com.awesomeapp.mediacart.Activity292_16
import com.awesomeapp.mediacart.Model292_18
import com.awesomeapp.mediacart.Activity292_19
import com.awesomeapp.mediacart.Model292_21

@Module
@InstallIn(SingletonComponent::class)
object Module_292 {
    @Provides
    @Singleton
    fun provideRepository292_5(
        api0: Api260_6 = Api260_6(),
        api1: Api276_6 = Api276_6(),
        api2: Api244_6 = Api244_6(),
        api3: Api272_6 = Api272_6(),
        api4: Api264_6 = Api264_6(),
        api5: Api248_6 = Api248_6(),
        api6: Api268_6 = Api268_6()
    ): Repository292_5 {
        return Repository292_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi292_6(): Api292_6 {
        return Api292_6()
    }
}