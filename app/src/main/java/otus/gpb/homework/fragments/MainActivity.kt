package otus.gpb.homework.fragments

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import otus.gpb.homework.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            openActivityA.setOnClickListener {
                startActivity(Intent(applicationContext, ActivityA::class.java))
            }
            openActivityB.setOnClickListener {
                startActivity(Intent(applicationContext, ActivityB::class.java))
            }
        }
    }
}

