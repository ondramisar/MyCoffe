package fluffy.android.com.mycoffe.database.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import fluffy.android.com.mycoffe.database.models.Achievement
import fluffy.android.com.mycoffe.database.models.UserAchievement

@Dao
interface AchievementDab {

    @Query("SELECT * FROM Achievement")
    fun getAllAchievement(): LiveData<List<Achievement>>

    @Query("SELECT * FROM Achievement WHERE id =:id")
    fun getAchievement(id: String): Achievement

    @Insert
    fun insertAchievement(achievement: Achievement)

    @Delete
    fun deleteAchievement(achievement: Achievement)


    @Query("SELECT * FROM UserAchievement")
    fun getAllUserAchievement(): LiveData<List<UserAchievement>>

    @Query("SELECT * FROM UserAchievement WHERE id =:id")
    fun getUserAchievement(id: String): UserAchievement

    @Insert
    fun insertUserAchievement(userAchievement: UserAchievement)

    @Delete
    fun deleteUserAchievement(userAchievement: UserAchievement)
}