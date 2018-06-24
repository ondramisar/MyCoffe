package fluffy.android.com.mycoffe.database.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import fluffy.android.com.mycoffe.database.models.Cafe

@Dao
interface CafeDao {

    @Query("SELECT * FROM Cafe")
    fun getAllCafe(): LiveData<List<Cafe>>

    @Query("SELECT * FROM Cafe WHERE id =:id")
    fun getCafe(id: String): Cafe

    @Insert
    fun insertCafe(cafe: Cafe)

    @Delete
    fun deleteCafe(cafe: Cafe)
}