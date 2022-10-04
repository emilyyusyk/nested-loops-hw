package com.company;

public class hw1 {

    public static void main(String[] args) {
        // 1.1
        for (int i = 1; i <= 5; i++)
            System.out.println ("1 2 3 4 5");

        // 1.2
        for (int j = 1; j <= 5; j++) {
            for (int k = j; k < j + 5; k++)
                System.out.print (k + " ");
            System.out.println ();
        }
    }
}
