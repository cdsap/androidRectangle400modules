package com.awesomeapp.alarmcart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.alarmcart.Viewmodel276_1
import com.awesomeapp.alarmcart.Activity276_2
import com.awesomeapp.alarmcart.Activity276_3
import com.awesomeapp.alarmcart.Fragment276_4
import com.awesomeapp.alarmcart.Repository276_5
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.alarmcart.Usecase276_7
import com.awesomeapp.alarmcart.Model276_9
import com.awesomeapp.alarmcart.Model276_10
import com.awesomeapp.alarmcart.Activity276_11
import com.awesomeapp.alarmcart.Model276_13
import com.awesomeapp.alarmcart.Activity276_14
import com.awesomeapp.alarmcart.Model276_16
import com.awesomeapp.alarmcart.Activity276_17
import com.awesomeapp.alarmcart.Model276_19
import com.awesomeapp.alarmcart.Activity276_20
import com.awesomeapp.alarmcart.Model276_22
import com.awesomeapp.alarmcart.Activity276_23
import com.awesomeapp.alarmcart.Model276_25
import com.awesomeapp.alarmcart.Activity276_26
import com.awesomeapp.alarmcart.Model276_28
import com.awesomeapp.alarmcart.Activity276_29
import com.awesomeapp.alarmcart.Model276_31
import com.awesomeapp.alarmcart.Activity276_32
import com.awesomeapp.alarmcart.Model276_34
import com.awesomeapp.alarmcart.Activity276_35
import com.awesomeapp.alarmcart.Model276_37
import com.awesomeapp.alarmcart.Activity276_38
import com.awesomeapp.alarmcart.Model276_40
import com.awesomeapp.alarmcart.Activity276_41
import com.awesomeapp.alarmcart.Model276_43
import com.awesomeapp.alarmcart.Activity276_44
import com.awesomeapp.alarmcart.Model276_46
import com.awesomeapp.alarmcart.Activity276_47

@Module
@InstallIn(SingletonComponent::class)
object Module_276 {
    @Provides
    @Singleton
    fun provideRepository276_5(
        api0: Api220_6 = Api220_6(),
        api1: Api208_6 = Api208_6(),
        api2: Api212_6 = Api212_6(),
        api3: Api236_6 = Api236_6(),
        api4: Api216_6 = Api216_6(),
        api5: Api204_6 = Api204_6(),
        api6: Api224_6 = Api224_6()
    ): Repository276_5 {
        return Repository276_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi276_6(): Api276_6 {
        return Api276_6()
    }
}