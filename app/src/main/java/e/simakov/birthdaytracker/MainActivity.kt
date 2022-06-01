package e.simakov.birthdaytracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import e.simakov.birthdaytracker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var rootElement: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rootElement = ActivityMainBinding.inflate(layoutInflater)
        val view = rootElement.root
        setContentView(view)
        openActivityAddBirthday()
    }

    private fun openActivityAddBirthday(){
        rootElement.buttonAddBirthday.setOnClickListener {
            val intent = Intent(this, AddBirthday::class.java)
            startActivity(intent)
        }

    }


}