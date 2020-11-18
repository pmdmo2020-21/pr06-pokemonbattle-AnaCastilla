package es.iessaladillo.pedrojoya.intents.ui.battle

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import es.iessaladillo.pedrojoya.intents.data.local.Database
import es.iessaladillo.pedrojoya.intents.data.local.model.Pokemon
import es.iessaladillo.pedrojoya.intents.databinding.BattleActivityBinding
import es.iessaladillo.pedrojoya.intents.ui.selection.SelectionActivity
import es.iessaladillo.pedrojoya.intents.ui.winner.WinnerActivity

class BattleActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_POKEMON_ID: String = "EXTRA_POKEMON_ID"

        fun newIntent(context: Context, pokemonId: Long): Intent {
            return Intent(context, BattleActivity::class.java).putExtra(EXTRA_POKEMON_ID, pokemonId)
        }
    }

    private lateinit var binding: BattleActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = BattleActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }




}