package fluffy.android.com.mycoffe.screens.LogInRegister.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import fluffy.android.com.mycoffe.R


class RegisterFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.register_fragment, container, false)

        arguments?.let {

        }

        return view
    }


    companion object {
        @JvmStatic
        fun newInstance() =
                RegisterFragment().apply {
                    arguments = Bundle().apply {

                    }
                }
    }
}
