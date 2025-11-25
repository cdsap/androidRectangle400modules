package com.awesomeapp.maplogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.maplogin.Viewmodel136_1
import com.awesomeapp.maplogin.Activity136_2
import com.awesomeapp.maplogin.Activity136_3
import com.awesomeapp.maplogin.Fragment136_4
import com.awesomeapp.maplogin.Repository136_5
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.maplogin.Model136_8
import com.awesomeapp.maplogin.Model136_9
import com.awesomeapp.maplogin.Activity136_10
import com.awesomeapp.maplogin.Model136_12
import com.awesomeapp.maplogin.Activity136_13

@Module
@InstallIn(SingletonComponent::class)
object Module_136 {
    @Provides
    @Singleton
    fun provideRepository136_5(
        api0: Api104_6 = Api104_6()
    ): Repository136_5 {
        return Repository136_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi136_6(): Api136_6 {
        return Api136_6()
    }
}