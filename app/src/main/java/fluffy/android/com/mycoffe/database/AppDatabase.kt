package fluffy.android.com.mycoffe.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import fluffy.android.com.mycoffe.database.dao.AchievmentDao
import fluffy.android.com.mycoffe.database.dao.CafeDao
import fluffy.android.com.mycoffe.database.dao.CoffeeDao
import fluffy.android.com.mycoffe.database.dao.UserDao
import fluffy.android.com.mycoffe.database.models.*

@Database(entities = arrayOf(User::class, Coffee::class, UserCoffee::class, Cafe::class, Achievement::class, UserAchievement::class),
        version = 1,
        exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun coffeeDao(): CoffeeDao
    abstract fun cafeDao(): CafeDao
    abstract fun achievmentDao(): AchievmentDao

    companion object {
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase? {
            if (INSTANCE == null) {
                synchronized(AppDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                            AppDatabase::class.java, "weather.db")
                            .build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}