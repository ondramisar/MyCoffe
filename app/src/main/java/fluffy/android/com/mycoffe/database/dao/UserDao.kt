package fluffy.android.com.mycoffe.database.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import fluffy.android.com.mycoffe.database.models.User

@Dao
interface UserDao {
    @Query("SELECT * FROM User WHERE id =:id")
    fun getUser(id: String): User
}