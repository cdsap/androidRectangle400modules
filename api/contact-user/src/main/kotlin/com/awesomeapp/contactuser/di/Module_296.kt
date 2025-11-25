package com.awesomeapp.contactuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.contactuser.Viewmodel296_1
import com.awesomeapp.contactuser.Activity296_2
import com.awesomeapp.contactuser.Activity296_3
import com.awesomeapp.contactuser.Fragment296_4
import com.awesomeapp.contactuser.Repository296_5
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.contactuser.Model296_8
import com.awesomeapp.contactuser.Model296_9
import com.awesomeapp.contactuser.Activity296_10
import com.awesomeapp.contactuser.Model296_12
import com.awesomeapp.contactuser.Activity296_13
import com.awesomeapp.contactuser.Model296_15
import com.awesomeapp.contactuser.Activity296_16
import com.awesomeapp.contactuser.Model296_18
import com.awesomeapp.contactuser.Activity296_19
import com.awesomeapp.contactuser.Model296_21
import com.awesomeapp.contactuser.Activity296_22
import com.awesomeapp.contactuser.Model296_24
import com.awesomeapp.contactuser.Activity296_25
import com.awesomeapp.contactuser.Model296_27
import com.awesomeapp.contactuser.Activity296_28
import com.awesomeapp.contactuser.Model296_30
import com.awesomeapp.contactuser.Activity296_31
import com.awesomeapp.contactuser.Model296_33
import com.awesomeapp.contactuser.Activity296_34
import com.awesomeapp.contactuser.Model296_36
import com.awesomeapp.contactuser.Activity296_37

@Module
@InstallIn(SingletonComponent::class)
object Module_296 {
    @Provides
    @Singleton
    fun provideRepository296_5(
        api0: Api260_6 = Api260_6(),
        api1: Api276_6 = Api276_6(),
        api2: Api268_6 = Api268_6(),
        api3: Api280_6 = Api280_6()
    ): Repository296_5 {
        return Repository296_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi296_6(): Api296_6 {
        return Api296_6()
    }
}