public class Number_Convertion {
    public static void main(String[] args) {
        // Convert binary,octal,hexadecimal number into decimal
        String bin = "0010";
        String octal = "7";
        String hexa = "B";
        int i = Integer.parseInt(bin, 2);
        int j = Integer.parseInt(octal, 8);
        int k = Integer.parseInt(hexa, 16);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

        // Convert decimal to binary,octal,hexadecimal number
        int dec = 62;
        String binary = Integer.toBinaryString(dec);
        String octall = Integer.toOctalString(dec);
        String hexadecimal = Integer.toHexString(dec);
        System.out.println(binary);
        System.out.println(octall);
        System.out.println(hexadecimal);
    }
}
