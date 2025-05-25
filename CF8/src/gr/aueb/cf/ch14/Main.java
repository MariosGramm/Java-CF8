package gr.aueb.cf.ch14;

public class Main {

    public static void main(String[] args) {

        Point p1 = Point.getInstance();
        Point p2 = Point.getRandomInstance() ; //static μέθοδοι καλούνται με το όνομα της κλάσης(static factory)

        CodingFactory cf1 = CodingFactory.getInstance();
        CodingFactory cf2 = CodingFactory.getInstance();
        CodingFactory cf3 = CodingFactory.getInstance();

        //δεν δημιουργούνται 3 instances , δημιουργείται το ίδιο instance 3 φορές , αυτό είναι το νόημα του singleton
    }
}
