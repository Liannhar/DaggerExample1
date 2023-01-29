package com.example.dagger2.module

import com.example.dagger2.classes.FileManager
import dagger.Module
import dagger.Provides

@Module
class CoreModule {
    @Provides
    fun provideFileManager()=FileManager()
}