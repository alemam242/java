public class Multidimentional_Array {
    public static void main(String[] args) {

        int k = 0;

        int[][] a = new int[4][]; /// DECLARATION OF MULTIDIMENTIONAL ARRAY

        a[0] = new int[1]; /// first row te 1 ta column initial korlam
        a[1] = new int[2]; /// second row te 2 ta column initial korlam
        a[2] = new int[3]; /// third row te 3 ta column initial korlam
        a[3] = new int[4]; /// fourth row te 4 ta column initial korlam

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                a[i][j] = k++;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
