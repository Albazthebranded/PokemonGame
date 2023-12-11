package Pokemon.Game;

import Pokemon.Game.Moves.Moves;
import Pokemon.Game.Moves.Tackle;
import Pokemon.Game.Moves.Thunder;
import Pokemon.Game.Pokemons.Abra;
import Pokemon.Game.Pokemons.Pikachu;
import Pokemon.Game.Pokemons.Pokemon;
import Pokemon.Game.Pokemons.Squirtle;
import Pokemon.Game.Utils.Attack;

public class Main {

    public static void main (String[] args) {

        //testing
        Pokemon pikachu = new Pikachu();
        Pokemon abra = new Abra();
        Pokemon squirtle = new Squirtle();
        Moves tackle = new Tackle();
        Moves thunder = new Thunder();

//        Attack.attack(pikachu, abra, tackle);
//
//        System.out.println(Math.round(abra.getCurrentHp()));
//        System.out.println(abra.getPokemonEnergy());
//
//        System.out.println(pikachu.getPokemonEnergy());
//        System.out.println(pikachu.getCurrentHp());
//
//        Attack.attack(pikachu, abra, tackle);
//        Attack.attack(pikachu, abra, tackle);
//        Attack.attack(pikachu, abra, thunder);
//
//        System.out.println(abra.getCurrentHp());

        Attack.attack(pikachu, squirtle, tackle);
        System.out.println(squirtle.getCurrentHp());
        Attack.attack(pikachu, squirtle, tackle);
        System.out.println(squirtle.getCurrentHp());
        Attack.attack(pikachu, squirtle, tackle);
        System.out.println(squirtle.getCurrentHp());
        Attack.attack(pikachu, squirtle, thunder);
        System.out.println(squirtle.getCurrentHp());
        System.out.println(pikachu.getLevel());
        System.out.println(pikachu.getCurrentExp());
        pikachu = new Squirtle();

    }
}