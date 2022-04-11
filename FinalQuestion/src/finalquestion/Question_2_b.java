package finalquestion;

class Odd extends Thread //1st thread
{

    public void run() {
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 1) {
                System.out.println("Odd: " + i);
            }
        }
    }
}

class Even extends Thread //2nd thread
{

    public void run() {
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}

public class Question_2_b {

    public static void main(String[] args) {
        Odd o = new Odd();
        Even e = new Even();

        o.setPriority(6);
        e.setPriority(3);

        o.start();
        e.start();
    }
}
