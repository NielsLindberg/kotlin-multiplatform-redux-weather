package dk.shape.kmpweather.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import dk.shape.kmpweather.androidApp.databinding.PlacesBinding
import dk.shape.kmpweather.androidApp.networking.WeatherService
import dk.shape.weatherstate.DI

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<PlacesBinding>(this, R.layout.places)
        binding.vm = PlacesViewModel()
    }
}
