package gr.aueb.cf.ch6;

public class WagesMappingExample {


    public static void main(String[] args) {
        int[] wages = new int[]{2000, 5000, 1000, 3000, 7000};
        final double BONUS = 0.25;
        double[] wagesWithBonus = getNewWages(wages, BONUS);

        for (double wage : wagesWithBonus) {
            System.out.printf("Ο νέος μισθός είναι %.2f \n",wage);
        }
    }

    public static double[] getNewWages(int[] wages , double BONUS){
        if (wages == null) return null;

        double[] array_out = new double[wages.length];

        for (int i = 0 ; i < wages.length ; i++){
            array_out[i] = wages[i] + (wages[i] * BONUS);
        }

        return array_out;
    }
}





