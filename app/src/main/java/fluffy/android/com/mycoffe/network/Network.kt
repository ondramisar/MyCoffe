package fluffy.android.com.mycoffe.network

import android.content.Context
import android.util.Log
import durdinapps.rxfirebase2.RxFirestore
import fluffy.android.com.mycoffe.database.AppDatabase
import fluffy.android.com.mycoffe.database.models.Cafe
import fluffy.android.com.mycoffe.database.models.Coffee
import fluffy.android.com.mycoffe.database.models.User
import fluffy.android.com.mycoffe.utilities.getCafePath
import fluffy.android.com.mycoffe.utilities.getCoffeePath
import fluffy.android.com.mycoffe.utilities.getFirestore
import fluffy.android.com.mycoffe.utilities.getUsersPath
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

//TODO need to think of way to merge or zip reguest together(problem cant crete fun for combining)
class Network(val context: Context) {

    fun downloadAll(){
        downloadCafe()
        downloadCoffee()
    }

    fun downloadUser() {
        val document = getFirestore().collection(getUsersPath()).document("UserId_1")

        RxFirestore.getDocument(document)
                .map({ userDoc -> userDoc.toObject(User::class.java) })
                .subscribe({ casterUser ->

                })
    }

    fun downloadCoffee() {
        RxFirestore.getCollection(getFirestore().collection(getCoffeePath()))
                .map {
                    val doc = mutableListOf<Coffee>()
                    it.documents.forEach {
                        doc.add(Coffee(it))
                    }
                    return@map doc
                }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    Observable.fromCallable {
                        AppDatabase.getInstance(context)?.coffeeDao()?.insertCoffeeList(it)
                    }
                            .subscribeOn(Schedulers.io())
                            .observeOn(AndroidSchedulers.mainThread())
                            .subscribe {
                                Log.i("usern", "DONE")
                            }
                }
    }

    fun downloadCafe() {
        RxFirestore.getCollection(getFirestore().collection(getCafePath()))
                .map {
                    val doc = mutableListOf<Cafe>()
                    it.documents.forEach {
                        doc.add(Cafe(it))
                    }
                    return@map doc
                }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    Observable.fromCallable {
                        AppDatabase.getInstance(context)?.cafeDao()?.insertCafeList(it)
                    }
                            .subscribeOn(Schedulers.io())
                            .observeOn(AndroidSchedulers.mainThread())
                            .subscribe {
                                Log.i("usern", "DONE")
                            }
                }
    }

    fun downloadAchievement() {
    }
}