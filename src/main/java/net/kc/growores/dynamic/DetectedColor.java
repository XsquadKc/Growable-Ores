package net.kc.growores.dynamic;

public class DetectedColor {

    private final int color;
    private int occurrences;
    private double totalDistance;

    public DetectedColor(int color) {
        this.color = color;
    }

    public void add(double distance) {
        occurrences++;
        totalDistance += distance;
    }

    public int getColor() {
        return color;
    }

    public int getOccurrences() {
        return occurrences;
    }

    public double getAverageDistance() {
        if (occurrences == 0) {
            return 0;
        }

        return totalDistance / occurrences;
    }

    public double getScore() {

        double freq = Math.log(occurrences + 1);
        double dist = getAverageDistance();

        return freq * dist;
    }
}
