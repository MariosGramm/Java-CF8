package gr.aueb.cf.ch1;

/**
 * Προσθέτει δύο ακεραίους και εμφανίζει το αποτέλεσμα στην κονσόλα.
 */
public class AddApp {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        //Εντολές
        result = num1 + num2;

        //Εκτύπωση αποτελέσματος
        System.out.println("The result is: " + result);
        System.out.println("The result of : " + num1 + " + " + num2 + " is " + result);
        System.out.printf("The result of %d and %d is: %d", num1, num2, result);

    }
}

