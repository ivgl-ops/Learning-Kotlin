package ivangladko.equationsolver

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import org.w3c.dom.Text
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    @SuppressLint("ShowToast", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.btnClick)
        var num1 = findViewById<EditText>(R.id.num1)
        var num2 = findViewById<EditText>(R.id.num2)
        var num3 = findViewById<EditText>(R.id.num3)
        val tvText = findViewById<TextView>(R.id.tvText)
        var a: Double
        var b: Double
        var c: Double
        var d: Double
        var x1: Double
        var x2: Double
        btn.setOnClickListener {
            a = num1.text.toString().toDouble()
            b = num2.text.toString().toDouble()
            c = num3.text.toString().toDouble()
            d = (b.pow(2.0) - 4 * a * c)
            tvText.setText(d.toString())
            val toast = Toast.makeText(applicationContext, "Процесс запущен $a", Toast.LENGTH_SHORT )
            toast.show()
        }

    }
}