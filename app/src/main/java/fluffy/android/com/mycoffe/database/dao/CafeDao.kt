package fluffy.android.com.mycoffe.database.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*
import fluffy.android.com.mycoffe.database.models.Cafe

@Dao
interface CafeDao {

    @Query("SELECT * FROM Cafe")
    fun getAllCafe(): LiveData<List<Cafe>>

    @Query("SELECT * FROM Cafe WHERE id =:id")
    fun getCafe(id: String): Cafe

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCafe(cafe: Cafe)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCafeList(cafes: List<Cafe>)

    @Delete
    fun deleteCafe(cafe: Cafe)
}