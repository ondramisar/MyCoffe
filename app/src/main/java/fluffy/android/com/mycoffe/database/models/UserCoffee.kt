package fluffy.android.com.mycoffe.database.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class UserCoffee {
    @PrimaryKey
    var id: String = ""

    var idUser: String = ""
    var idCoffee: String = ""

    var numOf: Int = 0
    var size: Int = 0
    var favourite: Int = 0
}