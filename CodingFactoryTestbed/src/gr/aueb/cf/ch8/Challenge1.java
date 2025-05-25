package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * Δύο βάτραχοι προσπαθούν να πιάσουν μία αράχνη.
 * Γράψτε μία μέθοδο που παίρνει ως είσοδο τρεις ακεραίους που αντιπροσωπεύουν τη θέση του κάθε βάτραχου καθώς και τη θέση της αράχνης.
 * Η διαφορά μεταξύ τον θέσεων δίνει την απόσταση μεταξύ του κάθε βάτραχου και της αράχνης.
 * Αν ο 1ος βάτραχος πιάσει την αράχνη, τότε εκτυπώστε μήνυμα «Βάτραχος 1», αν ο 2ος βάτραχος πιάσει την αράχνη, τότε εκτυπώστε μήνυμα του «Βάτραχος 2», αν και οι δύο βάτραχοι φτάσουν την ίδια στιγμή εκτυπώστε «Αράχνη».
 * Για παράδειγμα αν το input είναι 2 3 4 τότε εκτυπώνει «Βάτραχος 2». Αν είναι 5 7 6 τότε εκτυπώνει «Αράχνη».
 * Σας δίνεται ένας δισδιάστατος πίνακας όπου η κάθε γραμμή είναι 3 αριθμοί όπως παραπάνω και θα πρέπει να εκτυπώσετε μία απάντηση για κάθε περίπτωση.
 */
public class Challenge1 {

    public static void main(String[] args) {
        int f1,f2,sp ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε τις θέσεις των 2 βατράχων και της αράχνης");
        f1 = sc.nextInt();
        f2 = sc.nextInt();
        sp = sc.nextInt();

        frogsSpider(f1,f2,sp);

        int[][] grid = {{1,2,3},{7,3,2},{2,4,3},{4,2,1},{14,12,10}};

    }

    public static void frogsSpider(int f1 , int f2 , int sp){
        int f1_distance = Math.abs((sp - f1));
        int f2_distance = Math.abs((sp - f2));

        if (f1_distance > f2_distance) {
            System.out.println("Βάτραχος 1");
        }else if (f1_distance < f2_distance){
            System.out.println("Βάτραχος 2");
        }else
            System.out.println("Αράχνη");
    }
}
