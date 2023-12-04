package Pokemon.Game;

public class Main {

    public static void main (String[] args) {

        //testing
        Pokemon pikachu = new Pokemon();
        Pokemon abra = new Pokemon();
        Attack battle = new Attack();
        Moves tackle = new Moves();

        pikachu.pokemon("Pikachu", 1, "electric", "none", "alive",
                1, 100, 100, 15, 12, 0, 100, 0);

        abra.pokemon("Abra", 1, "psychic", "none", "alive",
                1, 100, 100, 15, 12, 0, 100, 0);

        tackle.move("normal", 12, 10, "quick");

        battle.attack(pikachu, abra, tackle);

        System.out.println(Math.round(abra.currentHp));
        System.out.println(pikachu.pokemonEnergy);
        System.out.println(pikachu.currentHp);
        System.out.println(abra.pokemonEnergy);

    }
}