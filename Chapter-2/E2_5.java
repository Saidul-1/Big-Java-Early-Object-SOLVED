import java.awt.*;

public class E2_5 {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5,10,20,30);
        box.add(0,0);
        System.out.println("Expected Location : x=0.0, y=0.0");
        System.out.println("Actual Location : x = "+box.getX()+", y = "+box.getY());
        System.out.println("Expected Width = *25.0, Height = *40.0");
        System.out.println("Actual Width = "+box.getWidth()+", Height = "+box.getHeight());
    }

}
