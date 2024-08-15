package bthn;

public class TimMaxSnt {
    public static void main(String[] args) {
        int[] nums = { 0, 3, 5, 7, 13, 17, 23, 29 };
        int min = -1;
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i])) {
                min = Math.min(min, nums[i]);
            }
        }

        if (min != -1) {
            System.out.println("Max: " + min);
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
}