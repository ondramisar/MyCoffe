package fluffy.android.com.mycoffe.database.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*
import fluffy.android.com.mycoffe.database.models.Coffee
import fluffy.android.com.mycoffe.database.models.UserCoffee

@Dao
interface CoffeeDao {

    @Query("SELECT * FROM Coffee")
    fun getAllCoffee(): LiveData<List<Coffee>>

    @Query("SELECT * FROM Coffee WHERE id =:id")
    fun getCoffee(id: String): Coffee

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCoffee(coffee: Coffee)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCoffeeList(coffees: List<Coffee>)

    @Delete
    fun deleteCoffee(coffee: Coffee)


    @Query("SELECT * FROM UserCoffee")
    fun getAllUserCoffee(): LiveData<List<UserCoffee>>

    @Query("SELECT * FROM UserCoffee WHERE id =:id")
    fun getUserCoffee(id: String): UserCoffee

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUserCoffee(userCoffee: UserCoffee)

    @Delete
    fun deleteUserCoffee(userCoffee: UserCoffee)
}