import java.util.Random;

public class E2_13 {
    public static void main(String[] args) {
        Random price = new Random();
        double randomPrice = price.nextDouble();
        randomPrice = randomPrice*(19.95-10)+10;
        System.out.println("Price: $"+String.format("%.2f",randomPrice));
    }
}
