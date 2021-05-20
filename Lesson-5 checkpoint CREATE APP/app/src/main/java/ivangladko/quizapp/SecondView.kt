package ivangladko.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SecondView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_view)
    }
    fun onclickBtn1(view: View)
    {
        val intent = Intent(this, ThreeView::class.java)
        startActivity(intent)
    }

}