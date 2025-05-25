package gr.aueb.cf.ch5;

/**
 * υπολογίζει το a ^ n αναδρομικά.
 */
public class PowerAppRecursive {

    public static void main(String[] args) {

    }

    public static int pow(int base , int power) {
//        if (power == 0) return 1;
//        return base * power(base , power - 1);

        return (power ==0) ? 1 : base * pow(base ,power-1);
    }
}
