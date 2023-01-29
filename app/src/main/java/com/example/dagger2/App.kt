package com.example.dagger2

import android.app.Application
import com.example.dagger2.classes.MyAppComponent
import com.example.dagger2.interfaces.*

class App:Application(), FragmentComponentDependenciesProvider {
    lateinit var appComponent:AppComponent
    override fun onCreate() {
        super.onCreate()
        //appComponent = DaggerAppComponent.factory().create(this)
        appComponent = MyAppComponent(this)
    }

    override fun getFragmentComponentDependencies(): FragmentComponentDependicies {
        return appComponent
    }


}