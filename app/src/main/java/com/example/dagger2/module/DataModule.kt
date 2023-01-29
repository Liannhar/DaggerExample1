package com.example.dagger2.module



import android.content.Context
import com.example.dagger2.classes.FileManager
import com.example.dagger2.classes.Data
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideDatabase(context: Context,fileManager: FileManager) = Data(context,fileManager)
}