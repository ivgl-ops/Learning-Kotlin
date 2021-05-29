package ivangladko.quizapp

import android.R.attr.name
import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*
import kotlin.random.Random


class FiveView : AppCompatActivity() {
    companion object {
        const val NOTIFICATION_ID = 101
        const val CHANNEL_ID = "channelID"
    }
    lateinit var billDateEditText: EditText
    var tvText: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five_view3)
        // finding the button
        val showButton = findViewById<Button>(R.id.showInput)
        val userYear = findViewById<EditText>(R.id.editTextNumber)

        // finding the edit text
        val editText = findViewById<EditText>(R.id.editText)
        val textTown = findViewById<EditText>(R.id.textTown)
        billDateEditText = findViewById(R.id.billDate_editText_billUpload)

        showDatePicker()

        // Setting On Click Listener
        showButton.setOnClickListener {

            // Getting the user input
            val text = editText.text.length
            val number: Int = userYear.getText().toString().toInt()
            val x = textTown.text.length
            var counter = 0
            var randDigit = 0
            val user = (text * number) / x
            if (user % 2 == 0)
            {
                randDigit = (6..11).random()
                val intent = Intent(this, LastView::class.java)
                intent.putExtra("digit", randDigit)
                startActivity(intent)

            }
            else
            {
                randDigit = (0..6).random()
                val intent = Intent(this, LastView::class.java)
                intent.putExtra("digit", randDigit)
                startActivity(intent)
            }
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