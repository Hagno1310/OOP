package rectangle;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public void setWidth(int width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(int height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    
    public int getPeremeter() {
        return 2 * (width + height);
    }

    public int getArea() {
        return width * height;
    }

}
