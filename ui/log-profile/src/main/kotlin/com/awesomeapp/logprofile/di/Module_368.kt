package com.awesomeapp.logprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.logprofile.Viewmodel368_1
import com.awesomeapp.logprofile.Activity368_2
import com.awesomeapp.logprofile.Activity368_3
import com.awesomeapp.logprofile.Fragment368_4
import com.awesomeapp.logprofile.Repository368_5
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.logprofile.Api368_6
import com.awesomeapp.logprofile.Model368_8
import com.awesomeapp.logprofile.Model368_9
import com.awesomeapp.logprofile.Activity368_10
import com.awesomeapp.logprofile.Model368_12
import com.awesomeapp.logprofile.Activity368_13
import com.awesomeapp.logprofile.Model368_15
import com.awesomeapp.logprofile.Activity368_16
import com.awesomeapp.logprofile.Model368_18
import com.awesomeapp.logprofile.Activity368_19
import com.awesomeapp.logprofile.Model368_21
import com.awesomeapp.logprofile.Activity368_22
import com.awesomeapp.logprofile.Model368_24
import com.awesomeapp.logprofile.Activity368_25
import com.awesomeapp.logprofile.Model368_27
import com.awesomeapp.logprofile.Activity368_28
import com.awesomeapp.logprofile.Model368_30
import com.awesomeapp.logprofile.Activity368_31

@Module
@InstallIn(SingletonComponent::class)
object Module_368 {
    @Provides
    @Singleton
    fun provideRepository368_5(
        api0: Api348_6 = Api348_6()
    ): Repository368_5 {
        return Repository368_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi368_6(): Api368_6 {
        return Api368_6()
    }
}