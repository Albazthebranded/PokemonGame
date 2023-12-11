package Pokemon.Game.Pokemons;

import Pokemon.Game.Moves.Moves;
import Pokemon.Game.Moves.Tackle;
import Pokemon.Game.Moves.Thunder;

public class Pikachu extends Pokemon {

    public Pikachu() {
        this.name = "Pikachu";
        this.pokedexNumber = 25;
        this.type = "electric";
        this.type2 = "none";
        this.status = "alive";
        this.level = 1;
        this.maxHp = this.currentHp = 90;
        this.attack = 15;
        this.defence = 12;
        this.pokemonEnergy = 0;
        this.currentExp = 0;
        this.maxExp = 100;
        this.evoNum = 1;
        this.evoCount = 2;
        Moves Tackle = new Tackle();
        Moves Thunder = new Thunder();
        this.knownMoves.add(1, Tackle);
        this.knownMoves.add(1, Thunder);
    }

    @Override
    protected void levelUp() {
        super.levelUp();
        this.maxHp += 5;
        this.attack += 1.1;
        this.defence += 0.6;
    }

    @Override
    protected void evolve() {
        if (this.evoNum < this.evoCount) {
            super.evolve();
            this.name = "Raichu";
            this.maxHp = this.currentHp = (90 + this.level * 8);
            this.attack += 15 + this.level * 1.2;
            this.defence += 12 + this.level * 0.7;
        }
    }
}
