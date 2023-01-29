package com.example.dagger2.classes

import com.example.dagger2.MainFragment
import com.example.dagger2.interfaces.FragmentComponent
import com.example.dagger2.interfaces.FragmentComponentDependicies
import com.example.dagger2.module.NetworkModule
import com.example.dagger2.module.RepositoryModule

class MyFragmentComponent(
    private val fragmentComponentDependicies: FragmentComponentDependicies
):FragmentComponent {

    private val networkModule:NetworkModule= NetworkModule()
    private val fragmentModule:RepositoryModule=RepositoryModule()

    override fun injectMainFragment(mainFragment: MainFragment){
        mainFragment.repository=fragmentModule.repositoryProvider(
            fragmentComponentDependicies.getData(),
            networkModule.provideTaskApi()
        )
    }
}