package Pokemon.Game;

public class EXPGain {

    public void gainExp (Pokemon.Game.Pokemon attacker, Pokemon.Game.Pokemon defender) {
        double temp;
        double lvlsGained = 1;

        if (!attacker.status.equals("down")) {
            attacker.currentExp += ((20 + attacker.level) * ((double)defender.level/attacker.level));
            attacker.currentExp = Math.round(attacker.currentExp);

            if (attacker.currentExp > (2 * attacker.maxExp)){
                lvlsGained = Math.floor((attacker.currentExp / attacker.maxExp));
            }

            if (attacker.currentExp >= attacker.maxExp) {
                temp = (attacker.maxExp - (attacker.currentExp - (attacker.maxExp * (lvlsGained - 1))));
                attacker.maxExp += 35;
                attacker.currentExp = 0 - temp;
                attacker.level += lvlsGained;

            }
        }
    }
}