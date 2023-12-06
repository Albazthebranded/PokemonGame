package Pokemon.Game.Pokemons;
public class Squirtle extends Pokemon {

    public Squirtle() {
        this.name = "Squirtle";
        this.pokedexNumber = 25;
        this.type = "water";
        this.type2 = "none";
        this.status = "alive";
        this.level = 1;
        this.maxHp = this.currentHp = 100;
        this.attack = 17;
        this.defence = 11;
        this.pokemonEnergy = 0;
        this.currentExp = 0;
        this.maxExp = 100;
    }

    @Override
    protected void levelUp() {
        super.levelUp();
        this.maxHp += 6;
        this.attack += 1;
        this.defence += 0.7;

    }
}
