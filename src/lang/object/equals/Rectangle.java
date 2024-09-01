package lang.object.equals;

import java.util.Objects;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width='" + width + '\'' +
                ", height='" + height + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        Rectangle rect = (Rectangle) obj;
        if(this == obj){
            return true;
        }
        if(rect == null || getClass() != rect.getClass()) {
            return  false;
        }

        return (width == rect.width && height == rect.height);

    }
}
