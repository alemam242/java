package finalquestion;

import java.util.*;

public class Question_2_a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Float> al = new Stack<Float>();
        System.out.println("Enter 5 float values: ");
        for (int i = 0; i < 5; i++) {
            al.push(input.nextFloat());
        }

        int option;
        do{
            System.out.print("Enter Choice: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter Value to insert: ");
                    al.push(input.nextFloat());
                    break;
                case 2:
                    System.out.println(al.peek() + " is deleted");
                    al.pop();
                    break;
                case 3:
                    System.out.println("Top value is: "+al.peek());
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        }while(option!=0);

    }

}
