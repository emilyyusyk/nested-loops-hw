package com.company;

public class hw3 {

    public static void main(String[] args) {
        int [] nums = {3, 7, 4, 1};
        for (int k = 0; k < nums.length; k++) {
            for (int l = 0; l < nums.length; l++)
                if (k != l)
                    System.out.println (10 * nums [l] + nums [k]);
        }
    }
}
