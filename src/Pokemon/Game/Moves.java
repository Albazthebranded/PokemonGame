package Pokemon.Game;
public class Moves {

    public String moveType;
    public String speed;
    public int moveDmg;
    public int energyVar;

    public void move(String moveType, int moveDmg, int energyVar, String speed){
        this.moveType = moveType;
        this.moveDmg = moveDmg;
        this.energyVar = energyVar;
        this.speed = "quick";

    }
}
