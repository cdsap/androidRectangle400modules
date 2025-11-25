package com.awesomeapp.analyticscart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.analyticscart.Viewmodel268_1
import com.awesomeapp.analyticscart.Activity268_2
import com.awesomeapp.analyticscart.Activity268_3
import com.awesomeapp.analyticscart.Fragment268_4
import com.awesomeapp.analyticscart.Repository268_5
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.analyticscart.Model268_8
import com.awesomeapp.analyticscart.Model268_9
import com.awesomeapp.analyticscart.Activity268_10
import com.awesomeapp.analyticscart.Model268_12
import com.awesomeapp.analyticscart.Activity268_13
import com.awesomeapp.analyticscart.Model268_15
import com.awesomeapp.analyticscart.Activity268_16
import com.awesomeapp.analyticscart.Model268_18
import com.awesomeapp.analyticscart.Activity268_19
import com.awesomeapp.analyticscart.Model268_21
import com.awesomeapp.analyticscart.Activity268_22
import com.awesomeapp.analyticscart.Model268_24
import com.awesomeapp.analyticscart.Activity268_25
import com.awesomeapp.analyticscart.Model268_27
import com.awesomeapp.analyticscart.Activity268_28
import com.awesomeapp.analyticscart.Model268_30
import com.awesomeapp.analyticscart.Activity268_31
import com.awesomeapp.analyticscart.Model268_33
import com.awesomeapp.analyticscart.Activity268_34
import com.awesomeapp.analyticscart.Model268_36
import com.awesomeapp.analyticscart.Activity268_37
import com.awesomeapp.analyticscart.Model268_39
import com.awesomeapp.analyticscart.Activity268_40

@Module
@InstallIn(SingletonComponent::class)
object Module_268 {
    @Provides
    @Singleton
    fun provideRepository268_5(
        api0: Api240_6 = Api240_6()
    ): Repository268_5 {
        return Repository268_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi268_6(): Api268_6 {
        return Api268_6()
    }
}