package ivangaldko.kickthehabit

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        verifyUserIsLogged()
    }
    private fun verifyUserIsLogged(){
        val uid = FirebaseAuth.getInstance().uid
        if (uid == null)
        {
            val intent = Intent(this, RegisterActivity::class.java )
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK.or(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }
    }
}