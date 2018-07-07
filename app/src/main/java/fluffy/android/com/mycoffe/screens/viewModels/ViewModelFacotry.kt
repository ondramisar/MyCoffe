package fluffy.android.com.mycoffe.screens.viewModels

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import fluffy.android.com.mycoffe.database.AppDatabase

class ViewModelFacotry(private val appDatabase: AppDatabase) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CoffeeListViewModel(appDatabase) as T
    }
}