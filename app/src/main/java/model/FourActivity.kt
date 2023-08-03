package model

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.xr.data.R

class FourActivity : AppCompatActivity()  {
    lateinit var tvName: TextView
    lateinit var tvQuestionNumber: TextView
    lateinit var tvQuestion: TextView
    lateinit var rbAnswer1: RadioButton
    lateinit var rbAnswer2: RadioButton
    lateinit var rbAnswer3: RadioButton
    lateinit var rbAnswer4: RadioButton
    lateinit var rgAnswers: RadioGroup
    lateinit var bSubmitNext: Button
    var count = 0
    var selected = 0
    lateinit var questions:ArrayList<Question>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fouractivity)
initViews()
    }
    private fun initViews() {
        val data = intent.getStringExtra("Qummi")
        tvName = findViewById(R.id.tv_name)
        tvQuestion = findViewById(R.id.tv_question)
        tvQuestionNumber = findViewById(R.id.tv_question_number)
        rbAnswer1 = findViewById(R.id.rb_answer1)
        rbAnswer2 = findViewById(R.id.rb_answer2)
        rbAnswer3 = findViewById(R.id.rb_answer3)
        rbAnswer4 = findViewById(R.id.rb_answer4)
        bSubmitNext = findViewById(R.id.b_submit_next)
        tvName.text = data
        setQuestion(count)
        bSubmitNext.setOnClickListener{
            if (rbAnswer1.isChecked) {
                selected = 1
            } else if (rbAnswer2.isChecked) {
                selected = 2
            } else if (rbAnswer3.isChecked) {
                selected = 3
            } else if (rbAnswer4.isChecked) {
                selected = 4
            }

            if (selected == questions[count].to) {
                count++
                setQuestion(count)
            } else {
                Toast.makeText(this, "Javob noto'g'ri", Toast.LENGTH_SHORT).show()
            }
            count++
            setQuestion(count)
        }


    }





    private fun setQuestion(i:Int) {
        tvQuestionNumber.text = "Question ${i + 1} / ${questions.size}"
        tvQuestion.text = questions[i].savol
        rbAnswer1.text = questions[i].variant1
        rbAnswer2.text = questions[i].variant2
        rbAnswer3.text = questions[i].variant3
        rbAnswer4.text = questions[i].variant4
    }
          fun loadQuestions() {
            questions = ArrayList()
            questions.add(Question("Savol1", "javob1", "javob2", "javob3", "javob4", 2))
            questions.add(Question("Savol2", "javob1", "javob2", "javob3", "javob4", 1))
            questions.add(Question("Savol3", "javob1", "javob2", "javob3", "javob4", 4))
            questions.add(Question("Savol4", "javob1", "javob2", "javob3", "javob4", 2))
            questions.add(Question("Savol5", "javob1", "javob2", "javob3", "javob4", 3))
            questions.add(Question("Savol6", "javob1", "javob2", "javob3", "javob4", 2))
            questions.add(Question("Savol7", "javob1", "javob2", "javob3", "javob4", 4))
            questions.add(Question("Savol8", "javob1", "javob2", "javob3", "javob4", 1))
            questions.add(Question("Savol9", "javob1", "javob2", "javob3", "javob4", 2))
            questions.add(Question("Savol10", "javob1", "javob2", "javob3", "javob4", 1))
        }
    }