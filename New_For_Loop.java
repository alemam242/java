public class New_For_Loop {
    public static void main(String[] args) {
        /// NAME OF THE LOOP IS 'for each loop' or 'enhanced for loop'
        /// EI LOOP SADHARONOTO ARRAY BA COLLECTION ER KHETRE USE KORA HOI

        String[] sr = { "suvo", "farhan", "anupam", "imran" }; /// ARRAY DECLARATION AND INITIALIZATION
        int sz = sr.length;
        System.out.println("Size of the string array is: " + sz);

        System.out.println("Printing array using normal for loop: ");
        for (int i = 0; i < sr.length; i++) /// NORMAL FOR LOOP
        {
            System.out.println(sr[i]);
        }

        System.out.println("\nPrinting array using for each loop: ");
        for (String s : sr) /// FOR EACH LOOP OR ENHANCED FOR LOOP
        {
            System.out.println(s);
        }
    }
}
