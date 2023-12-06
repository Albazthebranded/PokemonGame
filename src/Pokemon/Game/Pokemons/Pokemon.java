package Pokemon.Game.Pokemons;

import Pokemon.Game.Moves.Moves;

import java.util.List;

public abstract class Pokemon {

	protected String name;
	protected int pokedexNumber;
	protected String type;
	protected String type2;
	protected int level;
	protected String status;
	protected double currentHp;
	protected double maxHp;
	protected double attack;
	protected double defence;
	protected int pokemonEnergy;
	protected double currentExp;
	protected int maxExp;
	protected List<Moves> knownMoves;

	public double getCurrentHp() {
		return currentHp;
	}

	public int getPokemonEnergy() {
		return pokemonEnergy;
	}

	public int getLevel() {
		return level;
	}

	public String getType() {
		return type;
	}

	public String getType2() {
		return type2;
	}

	public double getAttack() {
		return attack;
	}

	public double getDefence() {
		return defence;
	}

	public void setCurrentHp(double currentHp) {
		this.currentHp = currentHp;

		if (this.currentHp > this.maxHp) {
			this.currentHp = this.maxHp;
			return;
		}
		if (this.currentHp <= 0) {
			this.currentHp = 0;
			this.status = "down";
		}
	}

	public void setPokemonEnergy(int energy) {
		this.pokemonEnergy = energy;

		if (this.pokemonEnergy > 100) {
			this.pokemonEnergy = 100;
			return;
		}

		if (this.pokemonEnergy < 0) {
			this.pokemonEnergy = 0;
		}
	}

	public void calculateEnergy(Moves move) {
		if (move.getSpeed().equals("quick")) {
			setPokemonEnergy(this.pokemonEnergy + move.getEnergyVar());

		}

		if (move.getSpeed().equals("charged")) {
			if (this.pokemonEnergy < move.getEnergyVar()) {
				throw new IllegalArgumentException("Pokemon needs " + move.getEnergyVar() + "but it currently has only: " + this.pokemonEnergy);
			}
			setPokemonEnergy(this.pokemonEnergy -= move.getEnergyVar());
		}
	}

	public void takeDamage(Double damage) {
		setCurrentHp(currentHp - damage);
	}


	public void gainExp(int defeatedPokemonLevel) {
		if (isDown()) {
			return;
		}

		this.currentExp += Math.min(0.75 * this.currentExp, ((20 + this.level) * ((double) defeatedPokemonLevel / this.level)));
		this.currentExp = Math.round(this.currentExp);

		if (this.currentExp >= this.maxExp) {
			levelUp();
		}
	}

	public boolean isDown() {
		return this.status.equals("down");
	}

	protected void levelUp() {
		this.currentExp -= this.maxExp;
		this.maxExp += 35;
		this.level++;
	}
}

//    public void abra () {
//        name = "Abra";
//        pokedexNumber = 63;
//        type = "psychic";
//        type2 = "none";
//        status = "alive";
//        level = 1;
//        maxHp = (100 + (3 * level));
//        currentHp = (100 + (3 * level));
//        attack = 6 + (1.3 * level);
//        defence = 2 + (0.8 * level);
//        pokemonEnergy = 0;
//        currentExp = 0;
//        maxExp = 90 + (10 * level);
//    }
//
//    public void bulbasaur() {
//            name = "Bulbasaur";
//            pokedexNumber = 1;
//            type = "grass";
//            type2 = "poison";
//            status = "alive";
//            level = 1;
//            maxHp = (100 + (3 * level));
//            currentHp = (100 + (3 * level));
//            attack = 6 + (1.3 * level);
//            defence = 2 + (0.8 * level);
//            pokemonEnergy = 0;
//            currentExp = 0;
//            maxExp = 90 + (10 * level);
//    }
//
//    public void ivysaur() {
//            name = "Ivysaur";
//            pokedexNumber = 2;
//            type = "grass";
//            type2 = "poison";
//            status = "alive";
//            level = 1;
//            maxHp = (100 + (3 * level));
//            currentHp = (100 + (3 * level));
//            attack = 6 + (1.3 * level);
//            defence = 2 + (0.8 * level);
//            pokemonEnergy = 0;
//            currentExp = 0;
//            maxExp = 90 + (10 * level);
//    }
//
//    public void venusaur() {
//        name = "Venusaur";
//        pokedexNumber = 3;
//        type = "grass";
//        type2 = "poison";
//        status = "alive";
//        level = 1;
//        maxHp = (100 + (3 * level));
//        currentHp = (100 + (3 * level));
//        attack = 6 + (1.3 * level);
//        defence = 2 + (0.8 * level);
//        pokemonEnergy = 0;
//        currentExp = 0;
//        maxExp = 90 + (10 * level);
//    }
//
//    public void charmander() {
//        name = "Charmander";
//        pokedexNumber = 4;
//        type = "fire";
//        type2 = "none";
//        status = "alive";
//        level = 1;
//        maxHp = (100 + (3 * level));
//        currentHp = (100 + (3 * level));
//        attack = 6 + (1.3 * level);
//        defence = 2 + (0.8 * level);
//        pokemonEnergy = 0;
//        currentExp = 0;
//        maxExp = 90 + (10 * level);
//    }
//
//    public void charmeleon() {
//        name = "Charmeleon";
//        pokedexNumber = 5;
//        type = "fire";
//        type2 = "none";
//        status = "alive";
//        level = 1;
//        maxHp = (100 + (3 * level));
//        currentHp = (100 + (3 * level));
//        attack = 6 + (1.3 * level);
//        defence = 2 + (0.8 * level);
//        pokemonEnergy = 0;
//        currentExp = 0;
//        maxExp = 90 + (10 * level);
//    }
//
//    public void charizard() {
//        name = "Charizard";
//        pokedexNumber = 6;
//        type = "fire";
//        type2 = "flying";
//        status = "alive";
//        level = 1;
//        maxHp = (100 + (3 * level));
//        currentHp = (100 + (3 * level));
//        attack = 6 + (1.3 * level);
//        defence = 2 + (0.8 * level);
//        pokemonEnergy = 0;
//        currentExp = 0;
//        maxExp = 90 + (10 * level);
//    }
//
//    public void squirtle() {
//        name = "Squirtle";
//        pokedexNumber = 7;
//        type = "water";
//        type2 = "none";
//        status = "alive";
//        level = 1;
//        maxHp = (100 + (3 * level));
//        currentHp = (100 + (3 * level));
//        attack = 6 + (1.3 * level);
//        defence = 2 + (0.8 * level);
//        pokemonEnergy = 0;
//        currentExp = 0;
//        maxExp = 90 + (10 * level);
//    }
//
//    public void wartortle() {
//        name = "Wartortle";
//        pokedexNumber = 8;
//        type = "water";
//        type2 = "none";
//        status = "alive";
//        level = 1;
//        maxHp = (100 + (3 * level));
//        currentHp = (100 + (3 * level));
//        attack = 6 + (1.3 * level);
//        defence = 2 + (0.8 * level);
//        pokemonEnergy = 0;
//        currentExp = 0;
//        maxExp = 90 + (10 * level);
//    }
//
//    public void blastoise() {
//        name = "Blastoise";
//        pokedexNumber = 9;
//        type = "water";
//        type2 = "none";
//        status = "alive";
//        level = 1;
//        maxHp = (100 + (3 * level));
//        currentHp = (100 + (3 * level));
//        attack = 6 + (1.3 * level);
//        defence = 2 + (0.8 * level);
//        pokemonEnergy = 0;
//        currentExp = 0;
//        maxExp = 90 + (10 * level);
//    }
/*


010  	caterpie 	bug
011  	metapod 	bug
012 	butterfree 	bug 	flying
013 	013 	weedle 		bug 	poison
014 	014 	kakuna 		bug 	poison
015 	015 	beedrill 	bug 	poison
016 	016 	pidgey 		normal 	flying
017 	017 	pidgeotto 	normal 	flying
018 	018 	pidgeot 	normal 	flying
019 	019 	rattata 	normal
020 	020 	raticate 	normal
021 	021 	spearow 	normal 	flying
022 	022 	fearow 	normal 	flying
023 	023 	ekans 		poison
024 	024 	arbok 		poison
025 	025 	pikachu 	electric
026 	026 	raichu 		electric
027 	027 	sandshrew 	ground
028 	028 	sandslash 	ground
029 	029 	nidoran♀ 	poison
030 	030 	nidorina 	poison
031 	031 	nidoqueen 	poison 	ground
032 	032 	nidoran♂ 	poison
033 	033 	nidorino 	poison
034 	034 	nidoking 	poison 	ground
035 	035 	clefairy 	fairy
036 	036 	clefable 	fairy
037 	037 	vulpix 		fire
038 	038 	ninetales 	fire
039 	039 	jigglypuff 	normal 	fairy
040 	040 	wigglytuff 	normal 	fairy
041 	041 	zubat 		poison 	flying
042 	042 	golbat 		poison 	flying
043 	043 	oddish 		grass 	poison
044 	044 	gloom 		grass 	poison
045 	045 	vileplume 	grass 	poison
046 	046 	paras 		bug 	grass
047 	047 	parasect 	bug 	grass
048 	048 	venonat 	bug 	poison
049 	049 	venomoth 	bug 	poison
050 	050 	diglett 	ground
051 	051 	dugtrio 	ground
052 	052 	meowth 		normal
053 	053 	persian 	normal
054 	054 	psyduck 	water
055 	055 	golduck 	water
056 	056 	mankey 		fighting
057 	057 	primeape 	fighting
058 	058 	growlithe 	fire
059 	059 	arcanine 	fire
060 	060 	poliwag 	water
061 	061 	poliwhirl 	water
062 	062 	poliwrath 	water 	fighting
063 	063 	abra 		psychic
064 	064 	kadabra 	psychic
065 	065 	alakazam 	psychic
066 	066 	machop 		fighting
067 	067 	machoke 	fighting
068 	068 	machamp 	fighting
069 	069 	bellsprout 	grass 	poison
070 	070 	weepinbell 	grass 	poison
071 	071 	victreebel 	grass 	poison
072 	072 	tentacool 	water 	poison
073 	073 	tentacruel 	water 	poison
074 	074 	geodude 	rock 	ground
075 	075 	graveler 	rock 	ground
076 	076 	golem 		rock 	ground
077 	077 	ponyta 		fire
078 	078 	rapidash 	fire
079 	079 	slowpoke 	water 	psychic
080 	080 	slowbro 	water 	psychic
081 	081 	magnemite 	electric steel
082 	082 	magneton 	electric steel
083 	083 	farfetch'd 	normal 	flying
084 	084 	doduo 		normal 	flying
085 	085 	dodrio 		normal 	flying
086 	086 	seel 		water
087 	087 	dewgong 	water 	ice
088 	088 	grimer 		poison
089 	089 	muk 		poison
090 	090 	shellder 	water
091 	091 	cloyster 	water 	ice
092 	092 	gastly 		ghost 	poison
093 	093 	haunter 	ghost 	poison
094 	094 	gengar 		ghost 	poison
095 	095 	onix 		rock 	ground
096 	096 	drowzee 	psychic
097 	097 	hypno 		psychic
098 	098 	krabby 		water
099 	099 	kingler 	water
100 	100 	voltorb 	electric
101 	101 	electrode 	electric
102 	102 	exeggcute 	grass 	psychic
103 	103 	exeggutor 	grass 	psychic
104 	104 	cubone 		ground
105 	105 	marowak 	ground
106 	106 	hitmonlee 	fighting
107 	107 	hitmonchan 	fighting
108 	108 	lickitung 	normal
109 	109 	koffing 	poison
110 	110 	weezing 	poison
111 	111 	rhyhorn 	ground 	rock
112 	112 	rhydon 		ground 	rock
113 	113 	chansey 	normal
114 	114 	tangela 	grass
115 	115 	kangaskhan 	normal
116 	116 	horsea 		water
117 	117 	seadra 		water
118 	118 	goldeen 	water
119 	119 	seaking 	water
120 	120 	staryu 		water
121 	121 	starmie 	water 	psychic
122 	122 	mr. mime 	psychic fairy
123 	123 	scyther 	bug 	flying
124 	124 	jynx 		ice 	psychic
125 	125 	electabuzz 	electric
126 	126 	magmar 		fire
127 	127 	pinsir 		bug
128 	128 	tauros 		normal
129 	129 	magikarp 	water
130 	130 	gyarados 	water 	flying
131 	131 	lapras 		water 	ice
132 	132 	ditto 		normal
133 	133 	eevee 		normal
134 	134 	vaporeon 	water
135 	135 	jolteon 	electric
136 	136 	flareon 	fire
137 	137 	porygon 	normal
138 	138 	omanyte 	rock 	water
139 	139 	omastar 	rock 	water
140 	140 	kabuto 		rock 	water
141 	141 	kabutops 	rock 	water
142 	142 	aerodactyl 	rock 	flying
143 	143 	snorlax 	normal
144 	144 	articuno 	ice 	flying
145 	145 	zapdos 		electric flying
146 	146 	moltres 	fire 	flying
147 	147 	dratini 	dragon
148 	148 	dragonair 	dragon
149 	149 	dragonite 	dragon 	flying
150 	150 	mewtwo 		psychic
151 	151 	mew 		psychic

         */

