package Pokemon.Game.Utils;

import Pokemon.Game.Moves.Moves;
import Pokemon.Game.Pokemons.Pokemon;

public class Attack {
	private Attack() {
	}
	public static void attack(Pokemon attacker, Pokemon defender, Moves move) {
		attacker.calculateEnergy(move);

		double STABMultiplier;
		double effective = Effectiveness.effectiveness(move.getMoveType(), defender.getType(), defender.getType2());

		if (move.getMoveType().equals(attacker.getType()) || move.getMoveType().equals(attacker.getType2())) {
			STABMultiplier = 1.20;
		} else {
			STABMultiplier = 1;
		}

		defender.takeDamage(effective * STABMultiplier * move.getMoveDmg() * (attacker.getAttack() / defender.getDefence()));

		if (defender.isDown()) {
			attacker.gainExp(defender.getLevel());
		}
	}
}
