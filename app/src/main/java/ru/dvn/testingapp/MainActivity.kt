package ru.dvn.testingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ru.dvn.testingapp.databinding.ActivityMainBinding
import ru.dvn.testingapp.utils.EmailValidator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val emailValidator = EmailValidator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
            .also { setContentView(it.root) }

        with(binding) {

            btnSubmit.setOnClickListener {
                edEmail.error = null
                val isValidEmail = emailValidator.isValid(edEmail.text.toString())

                if (isValidEmail.not()) {
                    edEmail.error = getString(R.string.invalid_email)
                    return@setOnClickListener
                }

                Toast.makeText(
                    this@MainActivity,
                    getString(R.string.valid_email),
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}