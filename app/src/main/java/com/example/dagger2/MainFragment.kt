package com.example.dagger2

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dagger2.classes.MyFragmentComponent
import com.example.dagger2.classes.Repository
import com.example.dagger2.interfaces.FragmentComponentDependenciesProvider
import com.example.dagger2.interfaces.FragmentComponentDependicies
import javax.inject.Inject

class  MainFragment : Fragment() {
    @Inject
    lateinit var repository: Repository

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        val  fragmentComponentDependencies=(context.applicationContext as FragmentComponentDependenciesProvider).getFragmentComponentDependencies()
        val fragmentComponent=MyFragmentComponent(fragmentComponentDependencies)
        fragmentComponent.injectMainFragment(this)
    }
}