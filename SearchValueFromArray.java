public class SearchValueFromArray {
    public static void main(String[] args) {
        int[] ar = { 10, 20, 30, 40, 50 };
        int key = 30, count = 0;
        for (int x : ar) {
            if (key == x) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(key + " is not available in array");
        } else {
            System.out.println(key + " is available in array");
        }
    }
}
