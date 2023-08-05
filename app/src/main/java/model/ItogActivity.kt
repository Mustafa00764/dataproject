package model

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.xr.data.R

class ItogActivity: AppCompatActivity() {
    lateinit var ll_n1:LinearLayout
    lateinit var ll_n2:LinearLayout
    lateinit var ll_n3:LinearLayout
    lateinit var ll_n4:LinearLayout
    lateinit var ll_n5:LinearLayout
    lateinit var ll_n6:LinearLayout
    lateinit var ll_n7:LinearLayout
    lateinit var ll_n8:LinearLayout
    lateinit var ll_n9:LinearLayout
    lateinit var ll_n10:LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.itogactivity)
initView()
    }

    private fun initView (){

        val data = intent.getIntegerArrayListExtra("resultat")
        ll_n1 = findViewById(R.id.ll_n1)
        ll_n2 = findViewById(R.id.ll_n2)
        ll_n3 = findViewById(R.id.ll_n3)
        ll_n4 = findViewById(R.id.ll_n4)
        ll_n5 = findViewById(R.id.ll_n5)
        ll_n6 = findViewById(R.id.ll_n6)
        ll_n7 = findViewById(R.id.ll_n7)
        ll_n8 = findViewById(R.id.ll_n8)
        ll_n9 = findViewById(R.id.ll_n9)
        ll_n10 = findViewById(R.id.ll_n10)

    }

}