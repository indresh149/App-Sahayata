package com.example.android.chatapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Login : AppCompatActivity() {

    private lateinit var editEmail: EditText
    private lateinit var editPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var btnSignUp: Button

    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()

        mAuth = FirebaseAuth.getInstance()

        editEmail = findViewById(R.id.edit_email)
        editPassword = findViewById(R.id.edit_password)
        btnLogin = findViewById(R.id.btnLogin)
        btnSignUp = findViewById(R.id.btnSignUp)

        btnSignUp.setOnClickListener {
            val intent = Intent(this,SignUp::class.java)
            finish()
            startActivity(intent)
        }

        btnLogin.setOnClickListener {
            val intent = Intent(this,HomePage::class.java)
            finish()
            startActivity(intent)
        }
//        btnLogin.setOnClickListener {
//            val email = editEmail.text.toString()
//            val password = editPassword.text.toString()
//
//            login(email,password);
//        }
    }

//    private fun login(email: String,password: String){
//        //logic for login in user
//        mAuth.signInWithEmailAndPassword(email, password)
//            .addOnCompleteListener(this) { task ->
//                if (task.isSuccessful) {
//                    // code for logging in user
//                    val intent = Intent(this@Login, HomePage::class.java)
//                    startActivity(intent)
//                } else {
//                    // If sign in fails, display a message to the user.
//                    Toast.makeText(this@Login, "User does not exist", Toast.LENGTH_SHORT).show()
//                }
//            }
//    }
}