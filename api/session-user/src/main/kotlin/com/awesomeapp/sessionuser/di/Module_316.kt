package com.awesomeapp.sessionuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.sessionuser.Viewmodel316_1
import com.awesomeapp.sessionuser.Activity316_2
import com.awesomeapp.sessionuser.Activity316_3
import com.awesomeapp.sessionuser.Fragment316_4
import com.awesomeapp.sessionuser.Repository316_5
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.sessionuser.Model316_8
import com.awesomeapp.sessionuser.Model316_9
import com.awesomeapp.sessionuser.Activity316_10
import com.awesomeapp.sessionuser.Model316_12
import com.awesomeapp.sessionuser.Activity316_13
import com.awesomeapp.sessionuser.Model316_15
import com.awesomeapp.sessionuser.Activity316_16
import com.awesomeapp.sessionuser.Model316_18
import com.awesomeapp.sessionuser.Activity316_19
import com.awesomeapp.sessionuser.Model316_21
import com.awesomeapp.sessionuser.Activity316_22
import com.awesomeapp.sessionuser.Model316_24
import com.awesomeapp.sessionuser.Activity316_25
import com.awesomeapp.sessionuser.Model316_27
import com.awesomeapp.sessionuser.Activity316_28
import com.awesomeapp.sessionuser.Model316_30
import com.awesomeapp.sessionuser.Activity316_31
import com.awesomeapp.sessionuser.Model316_33
import com.awesomeapp.sessionuser.Activity316_34
import com.awesomeapp.sessionuser.Model316_36
import com.awesomeapp.sessionuser.Activity316_37
import com.awesomeapp.sessionuser.Model316_39
import com.awesomeapp.sessionuser.Activity316_40
import com.awesomeapp.sessionuser.Model316_42
import com.awesomeapp.sessionuser.Activity316_43

@Module
@InstallIn(SingletonComponent::class)
object Module_316 {
    @Provides
    @Singleton
    fun provideRepository316_5(): Repository316_5 {
        return Repository316_5()
    }

    @Provides
    @Singleton
    fun provideApi316_6(): Api316_6 {
        return Api316_6()
    }
}