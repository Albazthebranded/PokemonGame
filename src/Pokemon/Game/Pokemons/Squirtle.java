package Pokemon.Game.Pokemons;
public class Squirtle extends Pokemon {

    public Squirtle() {
        this.name = "Squirtle";
        this.pokedexNumber = 7;
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
        this.evoNum = 1;
        this.evoCount = 3;
    }

    @Override
    protected void levelUp() {
        super.levelUp();
        this.maxHp += 6;
        this.attack += 1;
        this.defence += 0.7;

    }

    @Override
    protected void evolve() {
        if (this.evoNum == 1) {
            super.evolve();
            this.name = "Wartortle";
            this.maxHp = this.currentHp = (100 + this.level * 7);
            this.attack += 11 + this.level * 1.4;
            this.defence += 6 + this.level * 0.8;
        }
        if (this.evoNum == 2) {
            super.evolve();
            this.name = "Blastoise";
            this.maxHp = this.currentHp = (100 + this.level * 9);
            this.attack += 11 + this.level * 1.8;
            this.defence += 6 + this.level;
        }
    }
}
