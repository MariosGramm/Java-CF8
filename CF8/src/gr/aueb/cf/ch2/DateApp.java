package gr.aueb.cf.ch2;

/**
 * Εμφανίζει την ημερομηνία dd/mm/yyyy
 */

public class DateApp {

    public static void main(String[] args) {
        int day = 2 ;
        int month = 4 ;
        int year = 2025 ;

        System.out.println("Η ημερομηνία είναι: " + day + "/" + month + "/" + year);
        System.out.printf("Ή ημερομηνία είναι: %02d/%02d/%d", day , month , year);
    }
}
