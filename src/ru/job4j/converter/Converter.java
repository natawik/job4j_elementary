package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 85;
    }


    public static int rubleToDollar(int value) {
        return value / 75;
    }

    public static void main(String[] args) {
        int in1 = 170;
        int expected1 = 2;
        int out1 = rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("170 rubles are 2 euros. Test result : " + passed1);


        int in2 = 150;
        int expected2 = 2;
        int out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("150 rubles are 2 dollars. Test result : " + passed2);
    }

}

