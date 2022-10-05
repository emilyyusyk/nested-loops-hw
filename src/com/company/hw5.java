package com.company;

public class hw5 {

    public static void main(String[] args) {
        int [] nums = {1, 3, 2, 9, 1};
        System.out.println (uniques (nums));
    }
    static boolean uniques (int [] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++)
                if (numbers [i] == numbers[j] && i != j)
                    return false;
        }
        return true;
    }
}
