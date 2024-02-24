package edu.festu.ivankuznetsov.roomcomposesample.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import edu.festu.ivankuznetsov.roomcomposesample.database.converter.LocalDateTimeConverter
import edu.festu.ivankuznetsov.roomcomposesample.database.dao.EventDao
import edu.festu.ivankuznetsov.roomcomposesample.database.entity.Event
import edu.festu.ivankuznetsov.roomcomposesample.database.entity.SubEvent
import edu.festu.ivankuznetsov.roomcomposesample.database.entity.User

@TypeConverters(LocalDateTimeConverter::class)
@Database(entities = [Event::class, SubEvent::class, User::class], version = 1, exportSchema = false)
abstract class EventDatabase : RoomDatabase() {

    abstract fun eventDao(): EventDao

    companion object {
        @Volatile
        private var Instance: EventDatabase? = null

        fun getDatabase(context: Context): EventDatabase {
            // if the Instance is not null, return it, otherwise create a new database instance.
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, EventDatabase::class.java, "event_database")
                    .build()
                    .also { Instance = it }
            }
        }
    }
}