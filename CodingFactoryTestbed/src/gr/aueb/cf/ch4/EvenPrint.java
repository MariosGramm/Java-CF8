package gr.aueb.cf.ch4;

public class EvenPrint {

    public static void main(String[] args) {
        int sum = 0;
        int rows = 4;


//        for (int i = 0; i <= 20; i = i + 2) System.out.println(i);
//
//
//
//        for (int j = 1 ; j <= 50 ; j++ ) {
//            sum +=j;
//        }
//
//        System.out.println(sum);
//
//        for (int f = 10 ; f > 0 ; f-- ) {
//            System.out.println(f);
//        }




        for (int i = 1; i <= rows; i++) {
            // Τυπώνει τα κενά
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Τυπώνει τα αστεράκια
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Νέα γραμμή μετά από κάθε σειρά
            System.out.println();
        }
    }

}
