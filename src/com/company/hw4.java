package com.company;

public class hw4 {

    public static void main(String[] args) {
        // 4.1
        for (int a = 6; a > 0; a--) {
            for (int b = a; b > 0; b--)
                System.out.print ("*");
            System.out.println ();
        }

        // 4.2
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j <= i)
                    System.out.print ("*");
                else
                    System.out.print ("-");
            }
            System.out.println ();
        }
    }
}
