package fluffy.android.com.mycoffe.utilities

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.firestore.FirebaseFirestore

fun getFirestore(): FirebaseFirestore {
    return FirebaseFirestore.getInstance()
}

fun getFirebaseUser(): FirebaseUser? {
    return getFirebaseAuth().currentUser
}

fun getFirebaseAuth(): FirebaseAuth {
    return FirebaseAuth.getInstance()
}

fun getCoffeePath(): String {
    return "coffee"
}

fun getCafePath(): String {
    return "cafe"
}

fun getUsersPath(): String {
    return "users"
}