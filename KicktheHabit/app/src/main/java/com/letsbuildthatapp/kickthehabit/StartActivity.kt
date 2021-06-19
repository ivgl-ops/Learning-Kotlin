package ivangaldko.kickthehabit

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        startButton.setOnClickListener {
            intent = Intent(
                    this, LoginActivity::class.java
            )
            startActivity(intent)
        }
    }
}