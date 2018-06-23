package fluffy.android.com.mycoffe.database.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class Achievement {
    @PrimaryKey
    var id: String = ""

    var type: String = ""
    var name: String = ""
    var description: String = ""
}