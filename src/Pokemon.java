public class Pokemon {
    private int  id;
    private String name;
    private String type;
    private int level;

    /**
     * Class Pokemon Builder
     * @param id pokedex identifier number
     * @param name pokemon name
     * @param type pokemon typing/type combination
     * @param level pokemon level
     */
    public Pokemon(int id, String name, String type,  int level) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.level = level;
    }

    /**
     * Get method for pokemon identifier
     * @return pokedex identifier
     */
    public int getId() {
        return id;
    }

    /**
     * Get method for Pokemon name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get method for Pokemon type combination
     * @return typing
     */
    public String getType() {
        return type;
    }

    /**
     * Get method for Pokemon level
     * @return level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Shows Pokemon and its attributes
     * @return String with Pokemon attributes
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Pokemon{");
        sb.append(String.format("id = %d; ", id));
        sb.append(String.format("name = %s; ", name));
        sb.append(String.format("type = %s; ", type));
        sb.append(String.format("level = %d", level));
        sb.append("}");

        return sb.toString();
    }
}
