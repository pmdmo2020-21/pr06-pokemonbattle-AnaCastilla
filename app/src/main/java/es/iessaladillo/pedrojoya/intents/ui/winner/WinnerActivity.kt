package es.iessaladillo.pedrojoya.intents.ui.winner

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
<<<<<<< HEAD
import es.iessaladillo.pedrojoya.intents.databinding.SelectionActivityBinding
=======
import es.iessaladillo.pedrojoya.intents.data.local.Database
import es.iessaladillo.pedrojoya.intents.data.local.model.Pokemon
>>>>>>> main
import es.iessaladillo.pedrojoya.intents.databinding.WinnerActivityBinding

class WinnerActivity : AppCompatActivity() {

<<<<<<< HEAD
    private lateinit var binding: WinnerActivityBinding
=======
    companion object {
        const val EXTRA_WINNER_ID: String = "EXTRA_WINNER_ID"
        fun newIntent(context: Context, pokemonId: Long): Intent {
            return Intent(context, WinnerActivity::class.java).putExtra(EXTRA_WINNER_ID, pokemonId)
        }
    }

    private lateinit var binding: WinnerActivityBinding
    private lateinit var pokemon: Pokemon
>>>>>>> main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = WinnerActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
<<<<<<< HEAD
=======
        getDataFromBattleActivity()
        setupViews()
    }

    private fun getDataFromBattleActivity() {
        getIntentDataFromBattleActivity()
        pokemon = Database.getPokemonById(intent.getLongExtra(EXTRA_WINNER_ID, 0))!!
    }

    private fun getIntentDataFromBattleActivity() {
        if(intent == null || !intent.hasExtra(EXTRA_WINNER_ID)) {
            throw RuntimeException("WinnerActivity needs to receive a winner pokemon")
        }
    }

    private fun setupViews() {
        binding.imgWinnerPokemon.setImageDrawable(getDrawable(pokemon.image))
        binding.txtWinnerBottom.text = getString(pokemon.name)
>>>>>>> main
    }

}