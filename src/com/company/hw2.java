package com.company;

public class hw2 {

    public static void main(String[] args) {
        boolean flag = false;
        int [] a = {1, 3, 8, 2, -3};
        int [] b = {6, -2, 13, 17, 2};

        for (int n = 0; n < a.length; n++)
            for (int m = 0; m < b.length && !flag; m++)
                if (a [n] == b [m])
                    flag = true;

        System.out.println (flag);
    }
}
