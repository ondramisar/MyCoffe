package fluffy.android.com.mycoffe.database.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class Coffee {
    @PrimaryKey
    var id: String = ""

    var name: String = ""
    var shortDesctiptio: String = ""
    var description: String = ""
    var experiencePerOne: Long = 0
}