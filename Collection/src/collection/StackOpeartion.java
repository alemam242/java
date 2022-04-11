package collection;

import java.util.Scanner;
import java.util.Stack;

public class StackOpeartion {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        Scanner input = new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            st.push(input.nextInt());
        }
//        st.push(10);
//        st.push(15);
//        st.push(30);
//        st.push(40);
//        st.push(50);
//        st.push(60);
//        st.push(70);
        
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.search(15));
    }
}
