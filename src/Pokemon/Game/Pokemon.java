package Pokemon.Game;

public class Pokemon {

    public String name;
    public int pokedexNumber;
    public String type;
    public String type2;
    public int level;
    public String status;
    public double currentHp;
    public double maxHp;
    public double attack;
    public double defence;
    public int pokemonEnergy;

    public double currentExp;
    public int maxExp;

    public void pikachu () {
        //test numbers /!\ update later
        name = "Pikachu";
        pokedexNumber = 25;
        type = "electric";
        type2 = "none";
        status = "alive";
        level = 1;
        maxHp = (100 + (5 * level));
        currentHp = (100 + (5 * level));
        attack = 5 + (1.2 * level);
        defence = 3 + (1.1 * level);
        pokemonEnergy = 0;
        currentExp = 0;
        maxExp = 90 + (10 * level);

    }

    public void abra () {
        name = "Abra";
        pokedexNumber = 63;
        type = "psychic";
        type2 = "none";
        status = "alive";
        level = 1;
        maxHp = (100 + (3 * level));
        currentHp = (100 + (3 * level));
        attack = 6 + (1.3 * level);
        defence = 2 + (0.8 * level);
        pokemonEnergy = 0;
        currentExp = 0;
        maxExp = 90 + (10 * level);
    }
}
