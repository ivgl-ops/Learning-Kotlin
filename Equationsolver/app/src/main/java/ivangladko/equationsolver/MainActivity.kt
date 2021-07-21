package ivangladko.equationsolver

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    @SuppressLint("ShowToast", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.btnClick)
        var num1 = findViewById<EditText>(R.id.num1)
        var num2 = findViewById<EditText>(R.id.num2)
        var num3 = findViewById<EditText>(R.id.num3)

        btn.setOnClickListener {
            var a = Double.pa
            val toast = Toast.makeText(applicationContext, "Процесс запущен ${num1.text}", Toast.LENGTH_SHORT )
            toast.show()
        }

    }
}