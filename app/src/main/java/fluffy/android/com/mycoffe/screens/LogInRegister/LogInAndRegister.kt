package fluffy.android.com.mycoffe.screens.LogInRegister

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import fluffy.android.com.mycoffe.R
import fluffy.android.com.mycoffe.screens.LogInRegister.fragments.RegisterFragment

class LogInAndRegister : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_register_activity)

        supportFragmentManager.beginTransaction()
                .replace(R.id.login_register_container, RegisterFragment.newInstance())
                .commit()
    }
}