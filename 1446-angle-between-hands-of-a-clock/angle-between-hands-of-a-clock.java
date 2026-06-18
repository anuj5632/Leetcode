class Solution {
    public double angleClock(int hour, int minutes) {
        double minute = 6.0 * minutes;
        double hours = 30.0 * (hour % 12) + 0.5 * minutes;

        double diff = Math.abs(hours - minute);

        return Math.min(diff,360.0 - diff);
    }
}