public class Ball {

    private float x;
    private float y;
    private int radius;

    public Ball(float x, float y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void move(float xDisp, float yDisp) {
        x += xDisp;
        y += yDisp;
    }

    public String toString() {
        return "Ball at (" + x + "," + y + ")";
    }
}