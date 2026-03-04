public class Pokemon_Center {
    private Pokemon[] pokedex;
    private final int MAX_POKEDEX_CAPACITY;

    public Pokemon_Center(int pokedex_capacity) {
        this.MAX_POKEDEX_CAPACITY = pokedex_capacity;

        pokedex = new Pokemon[MAX_POKEDEX_CAPACITY];
    }
}
