package ru.mrwinwon.weatherwatcher.ui.weather.current

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import ru.mrwinwon.weatherwatcher.R

class CurrentWaetherFragment : Fragment() {

    companion object {
        fun newInstance() = CurrentWaetherFragment()
    }

    private lateinit var viewModel: CurrentWaetherViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.current_waether_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CurrentWaetherViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
