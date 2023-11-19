package Pokemon.Game;

public class HealthFormat {

    public void healthFormat(Pokemon.Game.Pokemon pokemon, double currentHp, double maxHp) {
        if (currentHp > maxHp) {
            currentHp = maxHp;
        }
        if (currentHp <= 0) {
            currentHp = 0;
            pokemon.status = "down";
        }
    }
}



