package fluffy.android.com.mycoffe.database.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class User {
    @PrimaryKey
    var id: String = ""

    var lvlId: String = ""
    var name: String = ""
    var email: String = ""
    var experience: Long = 0
    var photoId: String = ""
}