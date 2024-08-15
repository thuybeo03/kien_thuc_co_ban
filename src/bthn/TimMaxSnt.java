package bthn;

import org.w3c.dom.ls.LSOutput;

public class TimMaxSnt {
    public static void main(String[] args) {
        int[] nums = {  3, 5, 7, 13, 17, 23, 29 };
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i])) {
                max = Math.max(max, nums[i]);
            }
        }

        if (max != -1) {
            System.out.println("Max: " + max);
        } else {
            System.out.println("Not");
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
//    aa
}