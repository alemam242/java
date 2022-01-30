import java.util.Arrays;
// import java.util.*;

public class Array_Sorting {
    public static void main(String[] args) {
        int[] ar = { 3, 1, 5, -4, 2, 6 };
        String[] name = { "Imran", "Suvo", "Anupam", "Farhan" };

        Arrays.sort(ar); /// SORTING ARRAY

        for (int x : ar) /// NAME OF THIS LOOP IS FOR EACH LOOP
        {
            System.out.print(x + " ");
        }

        System.out.println();

        Arrays.sort(name); /// SORTING ARRAY

        for (String n : name) /// NAME OF THIS LOOP IS FOR EACH LOOP
        {
            System.out.print(n + " ");
        }
    }
}
