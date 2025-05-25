package gr.aueb.cf.ch12;

public class Main {

    public static void main(String[] args) {

        Student alice = new Student();
        Student bob = new Student(2 , "Bob" , "D.");

        bob.setId(23);
        System.out.println("Bob ID: " + bob.getId());



        alice.setId(10);     //set id
        alice.setFirstname("Alice");      //set firstname
        alice.setLastname("W.");          //set lastname

        System.out.println("ID: " + alice.getId());      //get id
        System.out.println("Firstname: " + alice.getFirstname());    //get firstname
        System.out.println("Lastname: " + alice.getLastname());      //get lastname

        bob.setLastname("Dylan");
    }
}
