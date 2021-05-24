package t.macbeth.cse310androidworkshop1solved

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bSayHello: Button = findViewById(R.id.b_sayHello)
        bSayHello.setOnClickListener { sayHello() }
    }

    private fun sayHello() {
        val etName: EditText = findViewById(R.id.et_name)
        val intent = Intent(this, HelloActivity::class.java)
        intent.putExtra("name", etName.text.toString())
        startActivity(intent)
    }
}