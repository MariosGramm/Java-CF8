package gr.aueb.cf.ch12;

import java.sql.SQLOutput;

public class StudentMain {

    public static void main(String[] args) {


        Student alice = new Student(1231, "Alice", "Roberts");
        Student bob = new Student();

        bob.setId(23);

        bob.setFirstname("Bob");

        System.out.println("Alice ID:" + alice.getId());
        System.out.println("Bob Name:" + bob.getFirstname());

        System.out.println(alice.getLastname());


    }
}
