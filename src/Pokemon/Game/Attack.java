package Pokemon.Game;

public class Attack {

    private final Effectiveness effectiveness = new Effectiveness();
    private final EnergyCalculator energy = new EnergyCalculator();
    private final HealthFormat healthFormat = new HealthFormat();
    private final EXPGain exp = new EXPGain();

    public void attack(Pokemon attacker, Pokemon defender, Moves move) {
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
