package Pokemon.Game;

import Pokemon.Game.Moves.Moves;
import Pokemon.Game.Moves.Tackle;
import Pokemon.Game.Pokemons.Abra;
import Pokemon.Game.Pokemons.Pikachu;
import Pokemon.Game.Pokemons.Pokemon;
import Pokemon.Game.Utils.Attack;

public class Main {

    public static void main (String[] args) {

        //testing
        Pokemon pikachu = new Pikachu();
        Pokemon abra = new Abra();
        Moves tackle = new Tackle();

//        abra.pokemon("Abra", 1, "psychic", "none", "alive",
//                1, 100, 100, 15, 12, 0, 100, 0);

        Attack.attack(pikachu, abra, tackle);

        System.out.println(Math.round(abra.getCurrentHp()));
        System.out.println(abra.getPokemonEnergy());

        System.out.println(pikachu.getPokemonEnergy());
        System.out.println(pikachu.getCurrentHp());
    }
}