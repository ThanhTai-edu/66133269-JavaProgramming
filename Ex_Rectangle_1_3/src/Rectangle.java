
public class Rectangle {

    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float l, float w) {
        length = l;
        width = w;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float getArea() {
        return length * width;
    }

    public float getPerimeter() {
        return 2 * (length + width);
    }
}