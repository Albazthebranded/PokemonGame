package Pokemon.Game.Pokemons;

public class Abra extends Pokemon {
	public Abra() {
		this.name = "Abra";
		this.pokedexNumber = 63;
		this.type = "psychic";
		this.type2 = "none";
		this.status = "alive";
		this.level = 1;
		this.maxHp = this.currentHp = 50;
		this.attack = 11;
		this.defence = 6;
		this.pokemonEnergy = 0;
		this.currentExp = 0;
		this.maxExp = 100;
		this.evoNum = 1;
		this.evoCount = 3;
	}

	@Override
	protected void levelUp() {
		super.levelUp();
		this.maxHp += 3;
		this.attack += 0.8;
		this.defence += 0.5;
	}

	@Override
	protected void evolve() {
		if (this.evoNum == 1) {
			super.evolve();
			this.name = "Kadabra";
			this.maxHp = this.currentHp = (50 + this.level * 5);
			this.attack += 11 + this.level * 1.4;
			this.defence += 6 + this.level * 0.8;
		}
		if (this.evoNum == 2) {
			super.evolve();
			this.name = "Alakazam";
			this.maxHp = this.currentHp = (50 + this.level * 6);
			this.attack += 11 + this.level * 2.1;
			this.defence += 6 + this.level * 0.9;
		}
	}
}
