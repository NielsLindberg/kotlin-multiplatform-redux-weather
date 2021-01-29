package dk.shape.kmpweather.androidApp

import android.app.Application
import dk.shape.kmpweather.androidApp.networking.WeatherService
import dk.shape.weatherstate.DI
import dk.shape.weatherstate.LoggerProtocol
import timber.log.Timber

class AndroidApp: Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        DI.setupLogger(object: LoggerProtocol {
            override fun log(string: String) {
                Timber.d(string)
            }
        })
        DI.setupWeatherService(WeatherService("a428b773470cf1f1888d7ca0aaea1751"))
    }

}