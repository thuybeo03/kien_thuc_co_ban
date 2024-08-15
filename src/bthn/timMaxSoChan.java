package bthn;

public class timMaxSoChan {
    public static void main(String[] args) {
        int[] nums = { 0, 3, 5,8, 7, 13, 17, 23, 29,12 ,4,6};
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                if(max<nums[i]){
                    max=nums[i];
                }
            }
        }
        System.out.println("max = " + max);
    }
}
