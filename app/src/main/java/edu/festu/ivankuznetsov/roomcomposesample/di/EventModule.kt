package edu.festu.ivankuznetsov.roomcomposesample.di

import edu.festu.ivankuznetsov.roomcomposesample.database.EventDatabase
import edu.festu.ivankuznetsov.roomcomposesample.database.repository.EventRepository
import edu.festu.ivankuznetsov.roomcomposesample.database.repository.EventRepositoryImpl
import edu.festu.ivankuznetsov.roomcomposesample.ui.viewmodel.EventListViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single<EventRepository> {
        EventRepositoryImpl(
            EventDatabase
                .getDatabase(this.androidContext())
                .eventDao()
        )
    }
    viewModel { EventListViewModel(get()) }
}