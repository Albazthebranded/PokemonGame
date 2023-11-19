package Pokemon.Game;

public class Main {

    public static void main (String[] args) {

        //testing
        Pokemon attacker = new Pokemon();
        Pokemon defender = new Pokemon();
        Attack attack = new Attack();
        Moves move = new Moves();

        attacker.pikachu();
        defender.abra();
        move.tackle();

        attack.attack(attacker, defender, move);

        System.out.println(Math.round(defender.currentHp));
        System.out.println(attacker.pokemonEnergy);
        System.out.println(attacker.currentHp);
        System.out.println(defender.pokemonEnergy);

    }
}