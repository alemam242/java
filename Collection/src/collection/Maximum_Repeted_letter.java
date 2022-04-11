package collection;

public class Maximum_Repeted_letter {

    public static void main(String[] args) {
        String str = "egg";
        int size = str.length();

        int max = 0, count;
        char res = '\0';

        for (int i = 0; i < size; i++) {
            count = 0;
            for (int j = i + 1; j < size; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                res = str.charAt(i);
            }
        }
        if (res == '\0') {
            System.out.println("not any repeted letter in the word '"+str+"'");
        } else {
            System.out.println(res);
        }

    }
}
