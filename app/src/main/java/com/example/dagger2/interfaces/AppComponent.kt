package com.example.dagger2.interfaces

import android.content.Context
import com.example.dagger2.classes.Data
import com.example.dagger2.module.CoreModule
import com.example.dagger2.module.DataModule
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DataModule::class, CoreModule::class])
interface AppComponent: FragmentComponentDependicies {

    override fun getData(): Data

    @Component.Factory
    interface AppComponentFactory {
        fun create(@BindsInstance context: Context): AppComponent
    }

}