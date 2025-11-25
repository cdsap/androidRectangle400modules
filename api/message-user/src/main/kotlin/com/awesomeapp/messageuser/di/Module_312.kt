package com.awesomeapp.messageuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.messageuser.Viewmodel312_1
import com.awesomeapp.messageuser.Activity312_2
import com.awesomeapp.messageuser.Activity312_3
import com.awesomeapp.messageuser.Fragment312_4
import com.awesomeapp.messageuser.Repository312_5
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.messageuser.Usecase312_7
import com.awesomeapp.messageuser.Model312_9
import com.awesomeapp.messageuser.Model312_10
import com.awesomeapp.messageuser.Activity312_11
import com.awesomeapp.messageuser.Model312_13
import com.awesomeapp.messageuser.Activity312_14
import com.awesomeapp.messageuser.Model312_16
import com.awesomeapp.messageuser.Activity312_17
import com.awesomeapp.messageuser.Model312_19
import com.awesomeapp.messageuser.Activity312_20
import com.awesomeapp.messageuser.Model312_22
import com.awesomeapp.messageuser.Activity312_23
import com.awesomeapp.messageuser.Model312_25
import com.awesomeapp.messageuser.Activity312_26

@Module
@InstallIn(SingletonComponent::class)
object Module_312 {
    @Provides
    @Singleton
    fun provideRepository312_5(
        api0: Api252_6 = Api252_6(),
        api1: Api276_6 = Api276_6(),
        api2: Api256_6 = Api256_6(),
        api3: Api260_6 = Api260_6(),
        api4: Api280_6 = Api280_6(),
        api5: Api268_6 = Api268_6(),
        api6: Api244_6 = Api244_6()
    ): Repository312_5 {
        return Repository312_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi312_6(): Api312_6 {
        return Api312_6()
    }
}