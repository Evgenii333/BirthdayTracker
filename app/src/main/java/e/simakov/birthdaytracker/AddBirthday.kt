package e.simakov.birthdaytracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import e.simakov.birthdaytracker.databinding.ActivityAddBirthdayBinding

class AddBirthday : AppCompatActivity() {

    private lateinit var rootElement: ActivityAddBirthdayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_birthday)

    }
}