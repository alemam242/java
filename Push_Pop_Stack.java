import java.util.Scanner;

class Stack {
    int[] ar = new int[10];
    int i = 0;

    void push(int a) {
        if (i < ar.length) {
            ar[i++] = a;
        } else {
            System.out.println("Stack is full");
        }
    }

    void pop() {
        if (i > 0) {
            ar[i - 1] = 0;
        } else {
            System.out.println("Stack is already empty");
        }
    }

    void show() {
        System.out.print("Value of Stack: ");
        for (int x : ar) {
            if (x == 0) {
                break;
            } else {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }
}

public class Push_Pop_Stack {
    public static void main(String[] args) {
        /**
         * For clear the console
         * // System.out.print("\033[H\033[2J");
         * // System.out.flush();
         */
        Scanner in = new Scanner(System.in);
        Stack ob = new Stack();
        boolean b = true;

        while (b) {
            System.out.println("Choose Operation");
            System.out.println("1. Insert");
            System.out.println("2. Pop");
            System.out.println("3. Print");
            System.out.print("Enter choice: ");
            int c = in.nextInt();
            switch (c) {
                case 0:
                    b = false;
                    break;
                case 1:
                    System.out.print("Enter value to insert: ");
                    int a = in.nextInt();
                    ob.push(a);
                    break;
                case 2:
                    ob.pop();
                    break;
                case 3:
                    ob.show();
                    break;
                default:
                    System.out.println("Wrong Input");
            }
        }
        in.close();
    }
}
