package ivangladko.quizapp

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.AsyncTask
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.IOException
import java.net.URL

class LastView : AppCompatActivity() {
    fun onClickbtn1(view: View)
    {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_view)
        val textView = findViewById<TextView>(R.id.textView23)
        val arguments = intent.extras

        if (arguments != null) {
            val digit = arguments.getInt("digit")
            if (digit == 1)
            {
                textView.setText("Вы козерог")
            }
            if (digit == 2)
            {
                textView.setText("Вы рыбы")
            }
            if (digit == 3)
            {
                textView.setText("Вы овен")
            }
            if (digit == 4)
            {
                textView.setText("Вы телец")
            }
            if (digit == 5)
            {
                textView.setText("Вы близнецы")
            }
            if (digit == 6)
            {
                textView.setText("Вы рак")
            }
            if (digit == 7)
            {
                textView.setText("Вы лев")
            }
            if (digit == 8)
            {
                textView.setText("Вы дева")
            }
            if (digit == 9)
            {
                textView.setText("Вы весы")
            }
            if (digit == 10)
            {
                textView.setText("Вы скорпион")
            }
            if (digit == 11)
            {
                textView.setText("Вы стрлец")
            }
        }

    }
}
