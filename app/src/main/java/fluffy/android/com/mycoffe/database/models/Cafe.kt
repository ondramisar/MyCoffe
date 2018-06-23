package fluffy.android.com.mycoffe.database.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class Cafe {
    @PrimaryKey
    var id: String = ""

    var idUser: String = ""
    var name: String = ""
    var stars: Int = 0
    var address: String = ""
}