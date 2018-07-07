package fluffy.android.com.mycoffe.screens.viewModels

import android.arch.lifecycle.ViewModel
import fluffy.android.com.mycoffe.database.AppDatabase

class CoffeeListViewModel(appDatabase: AppDatabase) : ViewModel() {

    var coffeeList = appDatabase.coffeeDao().getAllCoffee()
}