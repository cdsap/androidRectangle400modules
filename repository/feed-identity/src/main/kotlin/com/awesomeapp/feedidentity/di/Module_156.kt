package com.awesomeapp.feedidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.feedidentity.Viewmodel156_1
import com.awesomeapp.feedidentity.Activity156_2
import com.awesomeapp.feedidentity.Activity156_3
import com.awesomeapp.feedidentity.Fragment156_4
import com.awesomeapp.feedidentity.Repository156_5
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.feedidentity.Usecase156_7
import com.awesomeapp.feedidentity.Model156_9
import com.awesomeapp.feedidentity.Model156_10
import com.awesomeapp.feedidentity.Activity156_11
import com.awesomeapp.feedidentity.Model156_13
import com.awesomeapp.feedidentity.Activity156_14

@Module
@InstallIn(SingletonComponent::class)
object Module_156 {
    @Provides
    @Singleton
    fun provideRepository156_5(
        api0: Api112_6 = Api112_6()
    ): Repository156_5 {
        return Repository156_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi156_6(): Api156_6 {
        return Api156_6()
    }
}