package ivangaldko.kickthehabit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val password_editText = findViewById<EditText>(R.id.password_editText)
        val email_editText = findViewById<EditText>(R.id.email_editText)
        val username_editText = findViewById<EditText>(R.id.username_editText)
        val register_button = findViewById<Button>(R.id.registerbutton)
        val alrady_registration = findViewById<TextView>(R.id.alrady_have_account)
        register_button.setOnClickListener{
            val password = password_editText.text.toString()
            val email = email_editText.text.toString()
            val user_name = username_editText.text.toString()
            Log.d("MainActivity", "email is: $email")
            Log.d("MainActivity", "Password is: $password")
            Log.d("MainActivity", "UserName is: $user_name")
        }
        alrady_registration.setOnClickListener{
            Log.d("MainActivity", "Reload")
            val intent = Intent(this, LogActivity::class.java)
            startActivity(intent)

        }
    }
}