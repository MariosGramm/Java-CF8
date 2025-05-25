package gr.aueb.cf.ch3.examples;

public class SumMulAppExample {

    public static void main(String[] args) {
        int sum = 0 , mul = 1 , i = 1 ;

        while (i <= 10){
            sum += i ;
            i ++ ;
        }

        i = 1;

        while ( i <= 10) {
            mul *=i ;
            i++;
        }

        System.out.printf("Άθροισμα : %d , Γινόμενο : %d", sum , mul);
    }
}
