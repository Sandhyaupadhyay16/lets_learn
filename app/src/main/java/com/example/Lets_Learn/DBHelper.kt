package com.example.Lets_Learn

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DBHelper(context: Context?) :
    SQLiteOpenHelper(context, "Login.db", null, 1) {
    override fun onCreate(MyDB: SQLiteDatabase) {
        MyDB.execSQL("create Table users(username TEXT primary key, password TEXT, email TEXT )")
    }

    override fun onUpgrade(MyDB: SQLiteDatabase, i: Int, i1: Int) {
        MyDB.execSQL("drop Table if exists users")
    }

    fun insertData(username: String?, password: String?, email: String?): Boolean {
        val MyDB = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put("username", username)
        contentValues.put("password", password)
        contentValues.put("email", email)
        val result = MyDB.insert("users", null, contentValues)
        return if (result == -1L) false else true
    }

    fun checkusername(username: String): Boolean {
        val MyDB = this.writableDatabase
        val cursor = MyDB.rawQuery("Select * from users where username = ?", arrayOf(username))
        return if (cursor.count > 0) true else false
    }

    fun checkusernamepassword(username: String, password: String, email: String): Boolean {
        val MyDB = this.writableDatabase
        val cursor = MyDB.rawQuery(
            "Select * from users where username = ? and password = ? and email = ?",
            arrayOf(username, password, email)
        )
        return if (cursor.count > 0) true else false
    }

    companion object {
        const val DBNAME = "Login.db"
    }
}