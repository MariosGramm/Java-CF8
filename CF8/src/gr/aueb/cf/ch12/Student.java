package gr.aueb.cf.ch12;

/**
 * Very simple data class.
 * Data , Dafault Constructor , και getters και setters με convention ονομάζονται JavaBean.
 */

public class Student {
    private int id ;
    private String firstname ;
    private String lastname;

    public Student(){

    }

    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    //    public Student() {      //Default Constructor
//
//    }
//
//    /**
//     * Overloaded constructor
//     * @param id
//     * @param firstname
//     * @param lastname
//     */
//    public Student(int id , String firstname , String lastname){
//        this.id = id ;
//        this.firstname = firstname ;
//        this.lastname = lastname ;
//
//    }
//
//    public int getId() {    //getter
//        return id;
//    }
//
//    public void setId(int id){      //setter
//        this.id = id ;  //πεδίο της κλάσης //όταν η παράμετρος έχει το ίδιο όνομα με το πεδίο της κλάσης , το this το χρησιμοποιούμε για να δείξουμε το πεδίο της κλάσης
//    }
//
//    public String getFirstname(){     //getter
//        return firstname;
//    }
//
//    public void setFirstname(String firstname){     //setter
//        this.firstname = firstname;
//    }
//
//    public String getLastname() {       //getter
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {      //setter
//        this.lastname = lastname;
//    }

}
