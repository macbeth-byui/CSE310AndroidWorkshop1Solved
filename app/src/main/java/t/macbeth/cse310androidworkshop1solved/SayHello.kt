package t.macbeth.cse310androidworkshop1solved

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SayHello : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_say_hello)
        val tvMessage = findViewById<TextView>(R.id.tvMessage)
        val name = intent.getStringExtra("name")
        tvMessage.text = "Hello $name"
    }
}