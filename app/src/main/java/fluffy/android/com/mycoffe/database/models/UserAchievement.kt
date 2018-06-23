package fluffy.android.com.mycoffe.database.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class UserAchievement {
    @PrimaryKey
    var id: String = ""

    var idUser: String = ""
    var idAchievement: String = ""
}