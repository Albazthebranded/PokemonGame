package Pokemon.Game;

public class EnergyCalculator {

    public int energyCalc(String moveSpeed, int currentEnergy, int moveEnergy) {
        if (moveSpeed.equals("quick")) {
            currentEnergy = currentEnergy + moveEnergy;
        }
        if (moveSpeed.equals("charged")) {
            currentEnergy = currentEnergy - moveEnergy;
            if (currentEnergy < moveEnergy) {
                throw new IllegalArgumentException("Pokemon needs " + moveEnergy + " energy: " + currentEnergy);
            }
        }
        if (currentEnergy > 100) {
            currentEnergy = 100;
        }
        if (currentEnergy < 0) {
            currentEnergy = 0;
        }
        return currentEnergy;
    }
}
