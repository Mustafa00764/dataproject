package model

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.xr.data.R


class TwoActivity: AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.twoactivity)
        initViews()


    }
    private fun initViews() {
        var bGetStart = findViewById<Button>(R.id.b_getStart)
        bGetStart.setOnClickListener {
            var intent = Intent(this, ThreeActivity::class.java)
            startActivity(intent)

        }
    }

}