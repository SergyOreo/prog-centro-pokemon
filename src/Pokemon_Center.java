public class Pokemon_Center {
    private Pokemon[] pokedex;
    private final int MAX_POKEDEX_CAPACITY;

    public Pokemon_Center(int pokedex_capacity) {
        this.MAX_POKEDEX_CAPACITY = pokedex_capacity;

        pokedex = new Pokemon[MAX_POKEDEX_CAPACITY];
    }

    /**
     * Search for a Pokemon from the Pokedex by its identifier
     * @param id pokedex number
     * @return requested Pokemon, null if not found in the pokedex
     */
    public Pokemon findPokemonById(int id) {
        Pokemon pokemon = null;
        boolean found = false;

        for (int i = 0; i < MAX_POKEDEX_CAPACITY && !found; i++) {
            if (pokedex[i] != null && pokedex[i].getId() == id) {
                found = true;
                pokemon = pokedex[i];
            }
        }

        return pokemon;
    }

    /**
     * Search for first available space in the Pokedex
     * @return index of the available space, -1 if there's no space left
     */
    public int findFirstEmptySpace() {
        boolean found = false;
        int index = -1;

        for (int i = 0; i < MAX_POKEDEX_CAPACITY && !found; i++) {
            if (pokedex[i] == null) {
                found = true;
                index = i;
            }
        }

        return index;
    }

    /**
     * Register new Pokemon into Pokedex
     * @param pokemon new Pokemon
     * @return true if registered succesfully, false if it already exists or there's no space in the pokedex
     */
    public boolean registerPokemon(Pokemon pokemon) {
        int freeSpace;
        boolean registered;

        freeSpace = findFirstEmptySpace();
        if (freeSpace == -1 || findPokemonById(pokemon.getId()) != null) {
            registered = false;
        }  else {
            pokedex[freeSpace] = pokemon;
            registered = true;
        }

        return registered;
    }

}
