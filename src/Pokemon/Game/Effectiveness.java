package Pokemon.Game;

public class Effectiveness {

    private final Pokemon.Game.Pokemon defender = new Pokemon.Game.Pokemon();
    private final Pokemon.Game.Moves move = new Pokemon.Game.Moves();
    private static double normalX = 1.0, fightingX = 1.0, flyingX = 1.0, poisonX = 1.0, groundX = 1.0, rockX = 1.0, bugX = 1.0, ghostX = 1.0, steelX = 1.0,
            fireX = 1.0, waterX = 1.0, grassX = 1.0, electricX = 1.0, psychicX = 1.0, iceX = 1.0, dragonX = 1.0, darkX = 1.0, fairyX = 1.0;

    static double multiForType1;
    static double multiForType2;

    public double effectiveness(String moveType, String defenderType, String defenderType2) {
        this.move.moveType = moveType;
        this.defender.type = defenderType;
        this.defender.type2 = defenderType2;

        setMultiplierValues(move.moveType);
        multiForType1 = selectMultiplier(defender.type);

        if (!(defender.type2.equals("none"))) {
            setMultiplierValues(move.moveType);
            multiForType2 = selectMultiplier(defender.type2);
        } else {
            multiForType2 = 1;
        }

        return multiForType1 * multiForType2;
    }

    public double selectMultiplier(String defenderType) {
        this.defender.type = defenderType;

        switch (defenderType) {
            case "normal":
                return normalX;
            case "fire":
                return fireX;
            case "water":
                return waterX;
            case "grass":
                return grassX;
            case "electric":
                return electricX;
            case "ice":
                return iceX;
            case "fighting":
                return fightingX;
            case "poison":
                return poisonX;
            case "ground":
                return groundX;
            case "flying":
                return flyingX;
            case "psychic":
                return psychicX;
            case "bug":
                return bugX;
            case "rock":
                return rockX;
            case "ghost":
                return ghostX;
            case "dragon":
                return dragonX;
            case "dark":
                return darkX;
            case "steel":
                return steelX;
            case "fairy":
                return fairyX;
            default:
                return 1;
        }
    }

    public void setMultiplierValues(String moveType) {

        switch (moveType) {
            case "normal":
                rockX = 0.5;
                ghostX = 0;
                break;
            case "fire":
                fireX = 0.5;
                waterX = 0.5;
                grassX = 2;
                iceX = 2;
                bugX = 2;
                rockX = 0.5;
                dragonX = 0.5;
                steelX = 2;
                break;
            case "water":
                fireX = 2;
                waterX = 0.5;
                grassX = 0.5;
                groundX = 2;
                rockX = 2;
                dragonX = 0.5;
                break;
            case "grass":
                fireX = 0.5;
                waterX = 2;
                grassX = 0.5;
                poisonX = 0.5;
                groundX = 2;
                flyingX = 0.5;
                bugX = 0.5;
                rockX = 2;
                dragonX = 0.5;
                steelX = 0.5;
                break;
            case "electric":
                waterX = 2;
                grassX = 0.5;
                electricX = 0.5;
                groundX = 0;
                flyingX = 2;
                dragonX = 0.5;
                break;
            case "ice":
                fireX = 0.5;
                waterX = 0.5;
                grassX = 2;
                iceX = 0.5;
                groundX = 2;
                flyingX = 2;
                dragonX = 2;
                steelX = 0.5;
                break;
            case "fighting":
                normalX = 2.0;
                iceX = 2;
                poisonX = 0.5;
                flyingX = 0.5;
                psychicX = 0.5;
                bugX = 0.5;
                rockX = 2;
                ghostX = 0;
                darkX = 2;
                steelX = 2;
                fairyX = 0.5;
                break;
            case "poison":
                grassX = 2;
                poisonX = 0.5;
                groundX = 0.5;
                rockX = 0.5;
                ghostX = 0.5;
                steelX = 0;
                fairyX = 2;
                break;
            case "ground":
                fireX = 2.0;
                grassX = 0.5;
                electricX = 2;
                poisonX = 2;
                flyingX = 0;
                bugX = 0.5;
                rockX = 2;
                steelX = 2;
                break;
            case "flying":
                grassX = 2;
                electricX = 0.5;
                fightingX = 2;
                bugX = 2;
                rockX = 0.5;
                steelX = 0.5;
                break;
            case "psychic":
                fightingX = 2;
                poisonX = 2;
                psychicX = 0.5;
                darkX = 0;
                steelX = 0.5;
                break;
            case "bug":
                fireX = 0.5;
                grassX = 2;
                fightingX = 0.5;
                poisonX = 0.5;
                flyingX = 0.5;
                psychicX = 2;
                ghostX = 0.5;
                darkX = 2;
                steelX = 0.5;
                fairyX = 0.5;
                break;
            case "rock":
                fireX = 2;
                iceX = 2.0;
                fightingX = 0.5;
                groundX = 0.5;
                flyingX = 2;
                bugX = 2;
                steelX = 0.5;
                break;
            case "ghost":
                normalX = 0;
                psychicX = 2;
                ghostX = 2.0;
                darkX = 0.5;
                break;
            case "dragon":
                dragonX = 2.0;
                steelX = 0.5;
                fairyX = 0;
                break;
            case "dark":
                fightingX = 0.5;
                psychicX = 2;
                ghostX = 2;
                darkX = 0.5;
                fairyX = 0.5;
                break;
            case "steel":
                fireX = 0.5;
                waterX = 0.5;
                electricX = 0.5;
                iceX = 2;
                rockX = 2;
                steelX = 0.5;
                fairyX = 2;
                break;
            case "fairy":
                fireX = 0.5;
                fightingX = 2;
                poisonX = 0.5;
                dragonX = 2;
                darkX = 2;
                steelX = 0.5;
                break;
            default:
                break;
        }
    }
}
