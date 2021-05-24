package t.macbeth.cse310androidworkshop1solved

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HelloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        val tvMessage : TextView = findViewById(R.id.tv_message)
        tvMessage.text = "Hello World from " + intent.getStringExtra("name")
    }
}