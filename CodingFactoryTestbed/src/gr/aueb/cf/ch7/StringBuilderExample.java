package gr.aueb.cf.ch7;

public class StringBuilderExample {

    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder();

        sb.append("Καλημέρα");
        sb.append(" ");
        sb.append("κόσμε!");

        sb.insert( 9 , "άσχημε ");

        sb.replace(0,9,"Καλησπέρα a");

        sb.reverse();

        System.out.println(sb);
    }
}
