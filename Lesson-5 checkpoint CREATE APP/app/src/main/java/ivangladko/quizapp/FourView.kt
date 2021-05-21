package ivangladko.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FourView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four_view)
    }
    fun onclickBtn1(view: View)
    {
        val intent = Intent(this, FiveView::class.java)
        startActivity(intent)
    }
}