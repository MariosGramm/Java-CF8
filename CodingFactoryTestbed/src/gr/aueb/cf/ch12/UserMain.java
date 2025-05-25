package gr.aueb.cf.ch12;

public class UserMain {

    public static void main(String[] args) {
        User Marios = new User(4532312 , "Marios" , "Grammatopoulos" , "MariosGramm" , "2262002" , true);

        Marios.setPassword("aekara2121");

        System.out.printf("{%s : %s }" , Marios.getUsername() , Marios.getPassword());
    }
}
