import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 0; i < 15; i++) {
            int number = rand.nextInt(201) + 100;
            System.out.println(number);
        }
        System.out.println("-----------------------------------");
        for (int i = 0; i < 20; i++) {
            int num = (int) (Math.random() * 101) + 400;
            System.out.println(num);
        }
    }
}
