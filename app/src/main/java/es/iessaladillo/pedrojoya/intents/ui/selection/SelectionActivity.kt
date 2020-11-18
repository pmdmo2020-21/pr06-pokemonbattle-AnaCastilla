package es.iessaladillo.pedrojoya.intents.ui.selection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import es.iessaladillo.pedrojoya.intents.databinding.SelectionActivityBinding

class SelectionActivity : AppCompatActivity() {

    private lateinit var binding: SelectionActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SelectionActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onBackPressed() {
        // TODO: AQUÍ ES DONDE DEBES ESTABLECER EL RESULTADO CON setResult()
        // ...
        super.onBackPressed()
    }

}