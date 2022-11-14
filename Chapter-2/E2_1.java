import java.awt.*;

public class E2_1 {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(0,0,10,20);
        double width = box.getWidth();
        double height = box.getHeight();
        double area = width*height;
        System.out.println("Area = "+area);
        System.out.println("Expected Area = 200.0");
    }
}
