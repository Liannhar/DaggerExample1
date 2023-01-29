package com.example.dagger2.module

import com.example.dagger2.classes.Data
import com.example.dagger2.classes.Repository
import com.example.dagger2.interfaces.TaskApi
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @Provides
    fun repositoryProvider(data:Data,api:TaskApi):Repository
    {
        return Repository(data,api)
    }
}