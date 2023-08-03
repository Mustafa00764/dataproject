package model

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.xr.data.R

class ThreeActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.threeactivity)
initViews()
    }
    private fun initViews() {
        val etName = findViewById<EditText>(R.id.et_name)
        val bPlay = findViewById<Button>(R.id.b_play)

        bPlay.setOnClickListener {
            if (etName.text.toString().length >= 3) {
                val intent = Intent(this, FourActivity::class.java)
                intent.putExtra("Qummi", etName.text.toString())
                startActivity(intent)
            } else {
                Toast.makeText(this, "Avval ism kiritishingiz kerak", Toast.LENGTH_SHORT).show()
            }

        }

    }
}