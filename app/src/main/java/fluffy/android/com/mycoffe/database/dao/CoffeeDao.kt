package fluffy.android.com.mycoffe.database.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import fluffy.android.com.mycoffe.database.models.Coffee
import fluffy.android.com.mycoffe.database.models.UserCoffee

@Dao
interface CoffeeDao {

    @Query("SELECT * FROM Coffee")
    fun getAllCoffee(): LiveData<List<Coffee>>

    @Query("SELECT * FROM Coffee WHERE id =:id")
    fun getCoffee(id: String): Coffee

    @Insert
    fun insertCoffee(coffee: Coffee)

    @Delete
    fun deleteCoffee(coffee: Coffee)


    @Query("SELECT * FROM UserCoffee")
    fun getAllUserCoffee(): LiveData<List<UserCoffee>>

    @Query("SELECT * FROM UserCoffee WHERE id =:id")
    fun getUserCoffee(id: String): UserCoffee

    @Insert
    fun insertUserCoffee(userCoffee: UserCoffee)

    @Delete
    fun deleteUserCoffee(userCoffee: UserCoffee)
}