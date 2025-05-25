package gr.aueb.cf.ch5;

public class FloatDoubleExpr {

    public static void main(String[] args) {

        int intNum = 10 ;
        float floatNum = 0.1F;
        double doubleNum = 12.5 ;
        double doubleNum2 = 10.0 ; // 10D
        float floatResult = 0.0F ;
        double doubleResult = 0.0 ;
        final double PI = 3.14 ;
        final float LIGHT_SPEED = 3.0e5F;
        double div ;
        double remaining ;

        floatResult = floatNum + intNum;
        doubleResult = doubleNum + floatNum - intNum ;
        div = 12.5 / 3 ;
        remaining = 12.5 % 3 ;

        System.out.println("Div: " + div);
        System.out.println("Modulo: " + remaining);
        System.out.printf("%.2f\n" , div);
        System.out.printf("%05.2f\n" , remaining);

    }
}
