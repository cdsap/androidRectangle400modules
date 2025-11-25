package com.awesomeapp.notecart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.notecart.Viewmodel280_1
import com.awesomeapp.notecart.Activity280_2
import com.awesomeapp.notecart.Activity280_3
import com.awesomeapp.notecart.Fragment280_4
import com.awesomeapp.notecart.Repository280_5
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.notecart.Service280_7
import com.awesomeapp.notecart.Worker280_8
import com.awesomeapp.notecart.Model280_10
import com.awesomeapp.notecart.Model280_11
import com.awesomeapp.notecart.Activity280_12
import com.awesomeapp.notecart.Model280_14
import com.awesomeapp.notecart.Activity280_15
import com.awesomeapp.notecart.Model280_17
import com.awesomeapp.notecart.Activity280_18
import com.awesomeapp.notecart.Model280_20
import com.awesomeapp.notecart.Activity280_21
import com.awesomeapp.notecart.Model280_23
import com.awesomeapp.notecart.Activity280_24

@Module
@InstallIn(SingletonComponent::class)
object Module_280 {
    @Provides
    @Singleton
    fun provideRepository280_5(
        api0: Api212_6 = Api212_6(),
        api1: Api208_6 = Api208_6(),
        api2: Api204_6 = Api204_6(),
        api3: Api232_6 = Api232_6(),
        api4: Api240_6 = Api240_6(),
        api5: Api216_6 = Api216_6(),
        api6: Api236_6 = Api236_6(),
        api7: Api220_6 = Api220_6(),
        api8: Api224_6 = Api224_6(),
        api9: Api228_6 = Api228_6()
    ): Repository280_5 {
        return Repository280_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9)
    }

    @Provides
    @Singleton
    fun provideApi280_6(): Api280_6 {
        return Api280_6()
    }
}