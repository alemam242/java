public class Python {
    public static void main(String[] args) {
        String[] ar = { "p", "y", "t", "h", "o", "n" };
        int l = ar.length;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ar[j]);
            }
            System.out.println();
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l - (i + 1); j++) {
                System.out.print(ar[j]);
            }
            System.out.println();
        }
    }
}
