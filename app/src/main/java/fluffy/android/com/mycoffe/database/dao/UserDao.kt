package fluffy.android.com.mycoffe.database.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import fluffy.android.com.mycoffe.database.models.User

@Dao
interface UserDao {
    @Query("SELECT * FROM User WHERE id =:id")
    fun getUser(id: String): User

    @Insert
    fun insertUser(user: User)

    @Delete
    fun deleteUser(user: User)
}