package fluffy.android.com.mycoffe.screens

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import fluffy.android.com.mycoffe.R
import fluffy.android.com.mycoffe.network.Network
import fluffy.android.com.mycoffe.screens.LogInRegister.LogInAndRegister
import fluffy.android.com.mycoffe.utilities.getFirebaseUser

class Loading : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loading_activity)

        val network = Network(applicationContext)
        network.downloadAll()

        val user = getFirebaseUser()
        if (user != null) {
            val i = Intent(applicationContext, MainScreen::class.java)
            startActivity(i)
        } else {
            val i = Intent(applicationContext,LogInAndRegister::class.java)
            startActivity(i)
        }
    }
}
