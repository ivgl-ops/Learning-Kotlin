package ivangladko.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class firstView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_view)
    }
    fun onclickBtn1(view: View)
    {
        val intent = Intent(this, SecondView::class.java)
        startActivity(intent)
    }
}