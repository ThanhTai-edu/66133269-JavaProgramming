public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}