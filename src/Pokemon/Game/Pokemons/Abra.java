package Pokemon.Game.Pokemons;

public class Abra extends Pokemon {
	public Abra() {
		this.name = "Abra";
		this.pokedexNumber = 63;
		this.type = "psychic";
		this.type2 = "none";
		this.status = "alive";
		this.level = 1;
		this.maxHp = this.currentHp = 100;
		this.attack = 15;
		this.defence = 12;
		this.pokemonEnergy = 0;
		this.currentExp = 0;
		this.maxExp = 100;
	}

	@Override
	protected void levelUp() {
		super.levelUp();
		this.maxHp += 3;
		this.attack += 0.8;
		this.defence += 0.1;
	}
}
