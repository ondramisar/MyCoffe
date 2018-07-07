package fluffy.android.com.mycoffe.database.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.firebase.firestore.DocumentSnapshot

@Entity
class Coffee {
    @PrimaryKey
    var id: String = ""

    var name: String = ""
    var shortDesctiptio: String = ""
    var description: String = ""
    var experiencePerOne: Long = 0

    constructor()

    constructor(dataSnapshot: DocumentSnapshot){
        this.id = dataSnapshot.id
        this.name = dataSnapshot.getString("name").toString()
    }
}