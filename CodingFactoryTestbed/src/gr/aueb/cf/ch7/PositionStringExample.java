package gr.aueb.cf.ch7;

public class PositionStringExample {

    public static void main(String[] args) {
        String f = "Coding factory";

        int firstPosOfo =  f.indexOf("o");

        System.out.println(firstPosOfo);

        int secondPosOfo = f.indexOf("o", 2 );

        System.out.println(secondPosOfo);

        int lastPosofO = f.lastIndexOf("o");

        System.out.println(lastPosofO);
    }
}
