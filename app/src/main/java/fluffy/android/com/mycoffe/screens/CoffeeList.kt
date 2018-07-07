package fluffy.android.com.mycoffe.screens

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import fluffy.android.com.mycoffe.R
import fluffy.android.com.mycoffe.screens.viewModels.ViewModelFacotry
import fluffy.android.com.mycoffe.adapters.Adapter
import fluffy.android.com.mycoffe.database.AppDatabase
import fluffy.android.com.mycoffe.screens.viewModels.CoffeeListViewModel
import kotlinx.android.synthetic.main.fragment_coffee_list.view.*


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class CoffeeList : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_coffee_list, container, false)

        val viewModer = AppDatabase.getInstance(context!!)?.let { ViewModelFacotry(it).create(CoffeeListViewModel::class.java) }
        viewModer?.coffeeList?.observe(this, Observer {
            v.coffee_list.adapter = it?.let { it1 -> Adapter(it1, context!!) }
            v.coffee_list.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        })

        return v
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                CoffeeList().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}
