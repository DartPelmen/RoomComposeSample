package edu.festu.ivankuznetsov.roomcomposesample

import android.app.Application
import edu.festu.ivankuznetsov.roomcomposesample.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class EventsApplication: Application(){
  //  lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
      //  container = AppDataContainer(this)

        startKoin{
            androidLogger()
            androidContext(this@EventsApplication)
            modules(appModule)
        }

    }
}