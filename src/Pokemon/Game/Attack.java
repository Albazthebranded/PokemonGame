package Pokemon.Game;

public class Attack {

    private final Pokemon.Game.Effectiveness effectiveness = new Pokemon.Game.Effectiveness();
    private final Pokemon.Game.EnergyCalculator energy = new Pokemon.Game.EnergyCalculator();
    private final Pokemon.Game.HealthFormat healthFormat = new Pokemon.Game.HealthFormat();
    private final Pokemon.Game.EXPGain exp = new Pokemon.Game.EXPGain();

    public void attack(Pokemon.Game.Pokemon attacker, Pokemon.Game.Pokemon defender, Pokemon.Game.Moves move) {
        double STABMultiplier;
        double effective = effectiveness.effectiveness(move.moveType, defender.type, defender.type2);

        if (move.moveType.equals(attacker.type) || move.moveType.equals(attacker.type2)) {
            STABMultiplier = 1.20;
        } else {
            STABMultiplier = 1;
        }

        defender.currentHp -= (effective * (STABMultiplier * (((double) (move.moveDmg / 2)) * ((attacker.attack / defender.defence)))));
        healthFormat.healthFormat(defender, defender.currentHp, defender.maxHp);
        attacker.pokemonEnergy = energy.energyCalc(move.speed, attacker.pokemonEnergy, move.energyVar);

        if (defender.currentHp <= 0) {
            defender.status = "down";
            exp.gainExp(attacker, defender);

        }
    }
}
