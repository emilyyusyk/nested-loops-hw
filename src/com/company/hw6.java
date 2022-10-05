package com.company;

public class hw6 {

    public static void main(String[] args) {
        int [] a = {4, 4, 6, 11, -2, 3};
        int [] b = {5, 11, 11, -3, 3, 5};

        System.out.print ("a:");
        for (int u : a)
            System.out.print (" " + u);
        System.out.println ();

        System.out.print ("b:");
        for (int v : b)
            System.out.print (" " + v);
        System.out.println ();

        System.out.print ("sym diff:");
        sym_diff (a, b);
        sym_diff (b, a);
    }

    static void sym_diff (int [] a, int [] b) {
        for (int i = 0; i < a.length; i++) {
            boolean f = false;
            for (int j = 0; j < b.length && !f; j++)
                if (a [i] == b [j]) {
                    f = true;
                }
                if (!f)
                    System.out.print (" " + a [i]);
        }
    }
}
