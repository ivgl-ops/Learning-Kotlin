package ivangladko.quizapp

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.DatePickerDialog.OnDateSetListener
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*


class FiveView : AppCompatActivity() {
    lateinit var billDateEditText: EditText
    var tvText: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five_view3)
        // finding the button
        val showButton = findViewById<Button>(R.id.showInput)
        tvText = findViewById<TextView>(R.id.textView12)
        val tvText2 = findViewById<TextView>(R.id.tvText2)
        val userYear = findViewById<EditText>(R.id.editTextNumber)

        // finding the edit text
        val editText = findViewById<EditText>(R.id.editText)
        billDateEditText = findViewById(R.id.billDate_editText_billUpload)

        showDatePicker()


        // Setting On Click Listener
        showButton.setOnClickListener {

            // Getting the user input
            val text = editText.text
            val number: Int = userYear.getText().toString().toInt()
            if (editText == null)
            {

            }
            if (userYear == null)
            {
                throw Exception("Вы передали null заничение")
            }
            var x = text.length
            x = ((number * x)/x + 10) * 3 * x / 12

           // кайфую наслождаюсь прохрачное море
            //   шишки тропа
            //   черные ласточки
            //   как же я не навижу лошадей
            //   Раздолбил дыру, любими спосами перелез залез
            //    пил бы по чучуть и растягивал
            //            убежал бы от него обошел
            //     шел бы и оглядывался, чтобы не сбила машина или не упасть куда нибудь

            // плита
            // ребенок
            // дверь
            // звонок
            // белье

            // роскошь классно мне нравится 0
            // клиника страх не приятное чувство боль -1
            //        не страшно уютно средняя комната 0
            // что то либо стресное либо наооборт  1

            // самолет упал
            // пострадали елки никто не погиб
            // случайность




            // Showing the user input
        }

    }
    fun showDatePicker() {
        // DatePicker

        billDateEditText.setText(SimpleDateFormat("dd/MM/yyyy").format(System.currentTimeMillis()))

        var cal = Calendar.getInstance()

        val dateSetListener = DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
            cal.set(Calendar.YEAR, year)
            cal.set(Calendar.MONTH, monthOfYear)
            cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)

            val myFormat = "dd/MM/yyyy" // mention the format you need
            val sdf = SimpleDateFormat(myFormat, Locale.US)
            billDateEditText.setText(sdf.format(cal.time))
            var xor = billDateEditText.text.toString()
            tvText?.setText(xor)
        }

        billDateEditText.setOnClickListener {

            Log.d("Clicked", "Interview Date Clicked")

            val dialog = DatePickerDialog(this, dateSetListener,
                    cal.get(Calendar.YEAR),
                    cal.get(Calendar.MONTH),
                    cal.get(Calendar.DAY_OF_MONTH))

            dialog.datePicker.maxDate = CalendarHelper.getCurrentDateInMills()
            dialog.show()
        }
    }

}