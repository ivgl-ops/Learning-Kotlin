package ivangaldko.kickthehabit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val register_button = findViewById<Button>(R.id.registerbutton)
        val alrady_registration = findViewById<TextView>(R.id.alrady_have_account)
        register_button.setOnClickListener{
            PerformRegister()
        }
        alrady_registration.setOnClickListener{
            Log.d("MainActivity", "Reload")
            val intent = Intent(this, LogActivity::class.java)
            startActivity(intent)

        }
    }
    private fun PerformRegister(){
        val password_editText = findViewById<EditText>(R.id.password_editText)
        val email_editText = findViewById<EditText>(R.id.email_editText)
        val username_editText = findViewById<EditText>(R.id.username_editText)
        val password = password_editText.text.toString()
        val email = email_editText.text.toString()
        val user_name = username_editText.text.toString()
        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Пожалуйта повторите еще раз", Toast.LENGTH_SHORT ).show()
            return
        }
        Log.d("MainActivity", "email is: $email")
        Log.d("MainActivity", "Password is: $password")
        Log.d("MainActivity", "UserName is: $user_name")
        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener{
                if (it.isSuccessful) return@addOnCompleteListener
                Log.d("Main", "Succesful ${it.result?.user?.uid}")
            }

    }
}