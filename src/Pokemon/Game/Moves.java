package Pokemon.Game;
public class Moves {

    public String moveType;
    public String speed;
    public int moveDmg;
    public int energyVar;

    public void tackle(){
        moveType = "normal";
        moveDmg = 12;
        energyVar = 10;
        speed = "quick";

    }
    public void thunder() {
        moveType = "electric";
        moveDmg = 40;
        energyVar = -40;
        speed = "charged";



    }
}
