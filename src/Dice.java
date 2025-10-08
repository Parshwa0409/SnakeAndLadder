public class Dice {
    private final int min;
    private final int max;
    private final int maxConsecutiveRolls;

    public Dice(int min, int max, int maxConsecutiveRolls) {
        this.min = min;
        this.max = max;
        this.maxConsecutiveRolls = maxConsecutiveRolls;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getMaxConsecutiveRolls() {
        return maxConsecutiveRolls;
    }

    public int roll() {
        int rolls = 0;
        int total = 0;
        int currentRoll;

        do {
            currentRoll = (int)(Math.random() * (max - min + 1)) + min;
            System.out.println("Rolled: " + currentRoll);
            total += currentRoll;
            rolls++;
        } while (rolls < maxConsecutiveRolls && currentRoll == max);

        return total;
    }
}
