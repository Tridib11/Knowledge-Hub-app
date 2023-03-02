package com.example.test.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.cardview.widget.CardView

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val andro=findViewById<CardView>(R.id.cardweb1)
        val webo=findViewById<CardView>(R.id.cardweb2)
        val blocko=findViewById<CardView>(R.id.cardweb3)
        val mlo=findViewById<CardView>(R.id.cardweb5)
        val ioso=findViewById<CardView>(R.id.cardweb4)
        val aio=findViewById<CardView>(R.id.cardweb6)
        val call=findViewById<Button>(R.id.btn)

        call.setOnClickListener {
            intent=Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:"+"+917439433288"))
            startActivity(intent)
        }

        andro.setOnClickListener {
            Toast.makeText(applicationContext, "Android", Toast.LENGTH_SHORT).show()
            intent= Intent(applicationContext,and::class.java)
            startActivity(intent)
        }
        webo.setOnClickListener {
            Toast.makeText(applicationContext,"WebDevelopment",Toast.LENGTH_SHORT).show()
            intent= Intent(applicationContext,web::class.java)
            startActivity(intent)
        }
        mlo.setOnClickListener {
            Toast.makeText(applicationContext,"Machine learning",Toast.LENGTH_SHORT).show()
            intent= Intent(applicationContext,ml::class.java)
            startActivity(intent)
        }
        blocko.setOnClickListener {
            Toast.makeText(applicationContext,"Blockchain",Toast.LENGTH_SHORT).show()
            intent= Intent(applicationContext,block::class.java)
            startActivity(intent)
        }
        ioso.setOnClickListener {
            Toast.makeText(applicationContext,"IOS development",Toast.LENGTH_SHORT).show()
            intent= Intent(applicationContext,ios::class.java)
            startActivity(intent)
        }
        aio.setOnClickListener {
            Toast.makeText(applicationContext,"Artificial Inteligence",Toast.LENGTH_SHORT).show()
            intent= Intent(applicationContext,ai::class.java)
            startActivity(intent)
        }

    }
}