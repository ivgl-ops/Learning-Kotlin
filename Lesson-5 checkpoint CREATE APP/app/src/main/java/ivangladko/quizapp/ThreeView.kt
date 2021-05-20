package ivangladko.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ThreeView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_view)
    }
    fun onclickBtn1(view: View)
    {
        val intent = Intent(this, FourView::class.java)
        startActivity(intent)
    }
}