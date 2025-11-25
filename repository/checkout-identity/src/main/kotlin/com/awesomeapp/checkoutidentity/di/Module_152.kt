package com.awesomeapp.checkoutidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.checkoutidentity.Viewmodel152_1
import com.awesomeapp.checkoutidentity.Activity152_2
import com.awesomeapp.checkoutidentity.Activity152_3
import com.awesomeapp.checkoutidentity.Fragment152_4
import com.awesomeapp.checkoutidentity.Repository152_5
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.checkoutidentity.Model152_7
import com.awesomeapp.checkoutidentity.Activity152_8

@Module
@InstallIn(SingletonComponent::class)
object Module_152 {
    @Provides
    @Singleton
    fun provideRepository152_5(
        api0: Api88_6 = Api88_6(),
        api1: Api112_6 = Api112_6(),
        api2: Api84_6 = Api84_6(),
        api3: Api108_6 = Api108_6()
    ): Repository152_5 {
        return Repository152_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi152_6(): Api152_6 {
        return Api152_6()
    }
}