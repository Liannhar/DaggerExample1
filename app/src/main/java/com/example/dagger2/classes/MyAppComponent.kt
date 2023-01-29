package com.example.dagger2.classes

import android.content.Context
import androidx.fragment.app.Fragment
import com.example.dagger2.interfaces.AppComponent
import com.example.dagger2.MainFragment
import com.example.dagger2.interfaces.FragmentComponent
import com.example.dagger2.module.CoreModule
import com.example.dagger2.module.DataModule
import com.example.dagger2.module.NetworkModule
import com.example.dagger2.module.RepositoryModule

class MyAppComponent(private val context: Context): AppComponent {

    private val dataModule = DataModule()
    private val coreModule = CoreModule()
    override fun getData(): Data {
        return dataModule.provideDatabase(context,coreModule.provideFileManager())
    }


}