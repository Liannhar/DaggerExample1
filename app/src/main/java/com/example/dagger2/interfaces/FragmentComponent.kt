package com.example.dagger2.interfaces

import com.example.dagger2.MainFragment
import com.example.dagger2.module.NetworkModule
import com.example.dagger2.module.RepositoryModule
import dagger.Component

@Component(modules = [RepositoryModule::class,NetworkModule::class], dependencies = [FragmentComponentDependicies::class])
interface FragmentComponent {
    fun injectMainFragment(mainFragment: MainFragment)
}