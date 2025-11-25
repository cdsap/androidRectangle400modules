package com.awesomeapp.cartuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.cartuser.Viewmodel300_1
import com.awesomeapp.cartuser.Activity300_2
import com.awesomeapp.cartuser.Activity300_3
import com.awesomeapp.cartuser.Fragment300_4
import com.awesomeapp.cartuser.Repository300_5
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.cartuser.Service300_7
import com.awesomeapp.cartuser.Worker300_8
import com.awesomeapp.cartuser.Usecase300_9
import com.awesomeapp.cartuser.Model300_11
import com.awesomeapp.cartuser.Model300_12
import com.awesomeapp.cartuser.Activity300_13

@Module
@InstallIn(SingletonComponent::class)
object Module_300 {
    @Provides
    @Singleton
    fun provideRepository300_5(
        api0: Api280_6 = Api280_6(),
        api1: Api244_6 = Api244_6(),
        api2: Api252_6 = Api252_6(),
        api3: Api260_6 = Api260_6(),
        api4: Api276_6 = Api276_6(),
        api5: Api256_6 = Api256_6(),
        api6: Api264_6 = Api264_6()
    ): Repository300_5 {
        return Repository300_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi300_6(): Api300_6 {
        return Api300_6()
    }
}