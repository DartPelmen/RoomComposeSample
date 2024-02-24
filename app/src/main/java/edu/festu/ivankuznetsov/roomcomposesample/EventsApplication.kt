package edu.festu.ivankuznetsov.roomcomposesample

import android.app.Application
import edu.festu.ivankuznetsov.roomcomposesample.database.AppContainer
import edu.festu.ivankuznetsov.roomcomposesample.database.AppDataContainer

class EventsApplication: Application(){
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}