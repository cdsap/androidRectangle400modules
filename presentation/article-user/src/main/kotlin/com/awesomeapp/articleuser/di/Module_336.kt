package com.awesomeapp.articleuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.articleuser.Viewmodel336_1
import com.awesomeapp.articleuser.Activity336_2
import com.awesomeapp.articleuser.Activity336_3
import com.awesomeapp.articleuser.Fragment336_4
import com.awesomeapp.articleuser.Repository336_5
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.articleuser.Api336_6
import com.awesomeapp.articleuser.Usecase336_7
import com.awesomeapp.articleuser.Model336_9
import com.awesomeapp.articleuser.Model336_10
import com.awesomeapp.articleuser.Activity336_11
import com.awesomeapp.articleuser.Model336_13
import com.awesomeapp.articleuser.Activity336_14
import com.awesomeapp.articleuser.Model336_16
import com.awesomeapp.articleuser.Activity336_17
import com.awesomeapp.articleuser.Model336_19
import com.awesomeapp.articleuser.Activity336_20
import com.awesomeapp.articleuser.Model336_22

@Module
@InstallIn(SingletonComponent::class)
object Module_336 {
    @Provides
    @Singleton
    fun provideRepository336_5(
        api0: Api292_6 = Api292_6(),
        api1: Api316_6 = Api316_6(),
        api2: Api296_6 = Api296_6(),
        api3: Api304_6 = Api304_6(),
        api4: Api308_6 = Api308_6(),
        api5: Api312_6 = Api312_6()
    ): Repository336_5 {
        return Repository336_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi336_6(): Api336_6 {
        return Api336_6()
    }
}