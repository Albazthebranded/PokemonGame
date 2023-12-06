package Pokemon.Game.Pokemons;

public class Pikachu extends Pokemon {

	public Pikachu() {
		this.name = "Pikachu";
		this.pokedexNumber = 25;
		this.type = "electric";
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
		this.maxHp += 2;
	}
}
