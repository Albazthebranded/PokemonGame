package Pokemon.Game.Moves;
public abstract class Moves {

    protected String moveType;
    protected String speed;
    protected int moveDmg;
    protected int energyVar;

    public void move(String moveType, int moveDmg, int energyVar, String speed){
        this.moveType = moveType;
        this.moveDmg = moveDmg;
        this.energyVar = energyVar;
        this.speed = speed;
    }

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
