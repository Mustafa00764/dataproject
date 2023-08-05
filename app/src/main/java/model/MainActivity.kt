package model

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.xr.data.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()

    }

    private fun initViews() {
        Handler().postDelayed({
            openStartActivity()
        }, 3000)
    }

    private fun openStartActivity() {
        val intent = Intent(this, TwoActivity::class.java)
        startActivity(intent)
        finish()
    }
}