package com.example.Lets_Learn

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var username: EditText? = null
    var password: EditText? = null
    var btnlogin: Button? = null
    var email: EditText? = null
    var showpass: CheckBox? = null
    var DB: DBHelper? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        username = findViewById<View>(R.id.username1) as EditText
        password = findViewById<View>(R.id.password1) as EditText
        email = findViewById<View>(R.id.email1) as EditText
        btnlogin = findViewById<View>(R.id.btnsignin1) as Button
        showpass = findViewById<View>(R.id.showpass) as CheckBox
        DB = DBHelper(this)
        btnlogin!!.setOnClickListener {
            val user = username!!.text.toString()
            val pass = password!!.text.toString()
            val email = email!!.text.toString()
            if (user == "" || pass == "" || email == "") Toast.makeText(
                this@MainActivity,
                "Please enter all the fields",
                Toast.LENGTH_SHORT
            ).show() else {
                val checkuserpass = DB!!.checkusernamepassword(user, pass, email)
                if (checkuserpass == true) {
                    Toast.makeText(this@MainActivity, "Sign in successfull", Toast.LENGTH_SHORT)
                        .show()
                    val intent = Intent(applicationContext, second::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this@MainActivity, "Invalid Credentials", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }
        showpass!!.setOnClickListener {
            if (showpass!!.isChecked) {
                password!!.inputType = 1
            } else {
                password!!.inputType =
                    InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            }
        }
        btnlogin!!.setOnClickListener {
            startActivity(
                Intent(this, second::class.java)
                    .putExtra("username", username!!.text.toString())
            )
        }


    }
}








