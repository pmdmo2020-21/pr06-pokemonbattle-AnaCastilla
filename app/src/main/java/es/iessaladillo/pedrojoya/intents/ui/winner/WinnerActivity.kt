package es.iessaladillo.pedrojoya.intents.ui.winner

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import es.iessaladillo.pedrojoya.intents.databinding.SelectionActivityBinding
import es.iessaladillo.pedrojoya.intents.databinding.WinnerActivityBinding

class WinnerActivity : AppCompatActivity() {

    private lateinit var binding: WinnerActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = WinnerActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}