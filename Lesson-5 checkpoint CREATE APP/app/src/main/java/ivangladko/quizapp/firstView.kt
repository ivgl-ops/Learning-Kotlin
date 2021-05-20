package ivangladko.quizapp

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar

class firstView : AppCompatActivity() {
    var x: ProgressBar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_view)
        x = findViewById(R.id.Bar)
        progressBar.max = 10000
        val progress = 1000
        ObjectAnimator.ofInt(x, "progress", progress).setDuration(2000).start()

    }
    fun onclickBtn1(view: View)
    {
        val intent = Intent(this, SecondView::class.java)
        startActivity(intent)
    }
}