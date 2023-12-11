package Pokemon.Game.Moves;
public abstract class Moves {

    protected String moveName;
    protected String moveType;
    protected String speed;
    protected int moveDmg;
    protected int energyVar;

    public String getMoveType() {
        return moveType;
    }

    public String getSpeed() {
        return speed;
    }

    public int getMoveDmg() {
        return moveDmg;
    }

    public int getEnergyVar() {
        return energyVar;
    }
}
