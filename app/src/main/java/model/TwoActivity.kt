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


    }
    private fun initViews() {
        val bGetStart = findViewById<Button>(R.id.b_getStart)
        bGetStart.setOnClickListener {
            val intent = Intent(this, ThreeActivity::class.java)
            startActivity(intent)

        }
    }

}