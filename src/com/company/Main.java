package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 2;
        System.out.println(method(17,20));
        System.out.println(method(22,32));
        System.out.println(method(78,12));
        System.out.println(method(27,-19));
        System.out.println(method(45,28));
    }

    public static String method(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "можно идти гулять";
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return "можно идти гулять";
        } else if (age > 45 && temperature > -10 && temperature < 25){
            return "можно идти гулять";
        } else return "оставайтесь дома ";
    }
}

