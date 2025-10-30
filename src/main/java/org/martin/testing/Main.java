package org.martin.testing;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hej!");

        Addition addition = new Addition();
        int result = addition.add(3, 6);

        System.out.println("3 + 6 = " + result);

    }
    
}
