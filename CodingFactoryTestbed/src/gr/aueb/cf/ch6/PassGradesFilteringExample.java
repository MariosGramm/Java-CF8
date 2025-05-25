package gr.aueb.cf.ch6;

import java.util.Arrays;

public class PassGradesFilteringExample {

    public static void main(String[] args) {

        int[] grades = new int[] { 1 , 5 , 6 , 3 , 8 , 10};
        final int PASS = 5 ;
        int[] gradesPassed ;

        gradesPassed = getPassingGrades(grades , PASS);

        for (int grade : gradesPassed) {
            System.out.print(grade + " ");
        }
    }

    public static int[] getPassingGrades(int[] allGrades , int base) {
        if (allGrades == null || allGrades.length == 0 ) return new int[0] ;

        int[] passingGrades = new int[allGrades.length];
        int count = 0 ;

        for (int grade : allGrades) {
            if (grade >= base ){
                passingGrades[count] = grade ;
                count += 1;
            }
        }

        return Arrays.copyOf(passingGrades,count);



    }
}
