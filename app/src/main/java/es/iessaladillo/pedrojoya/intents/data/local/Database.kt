package es.iessaladillo.pedrojoya.intents.data.local

import es.iessaladillo.pedrojoya.intents.data.local.model.Pokemon

// TODO: Haz que Database implemente DataSource
object Database: DataSource {
    override fun getRandomPokemon(): Pokemon {
        TODO("Not yet implemented")
    }

    override fun getAllPokemons(): List<Pokemon> {
        TODO("Not yet implemented")
    }

    override fun getPokemonById(id: Long): Pokemon? {
        TODO("Not yet implemented")
    }


}