package com.example.dagger2.module

import com.example.dagger2.interfaces.TaskApi
import dagger.Module
import dagger.Provides

@Module
class NetworkModule {
    @Provides
    fun provideTaskApi():TaskApi{
        return object:TaskApi{ }
    }
}