import java.awt.*;

public class E2_2 {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(0,0,10,20);
        double width = box.getWidth();
        double height = box.getHeight();
        double perimeter = 2*(width+height);
        System.out.println("Perimeter = "+perimeter);
        System.out.println("Expected Perimeter = 60.0");
    }
}
