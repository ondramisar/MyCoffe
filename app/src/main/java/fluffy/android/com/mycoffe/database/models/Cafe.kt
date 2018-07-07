package fluffy.android.com.mycoffe.database.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.firebase.firestore.DocumentSnapshot

@Entity
class Cafe {
    @PrimaryKey
    var id: String = ""

    var idUser: String = ""
    var name: String = ""
    var stars: Int = 0
    var address: String = ""

    constructor()

    constructor(dataSnapshot: DocumentSnapshot){
        this.id = dataSnapshot.id
        this.name = dataSnapshot.getString("name").toString()
    }
}