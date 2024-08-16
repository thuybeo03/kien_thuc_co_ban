package bthn;

public class TimMin {
    // 1 ham truyen 2 so -> tra so be hon
    // 1 ham truyen 2 so -> tra so lon hon
    public static void main(String[] args) {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 40, 60, 100};
        int a = 5;
        int b = 10;
        int min = (a <= b) ? a : b;
        int max = (a >= b) ? a : b;
        int maxx = 0;
        int minn = Integer.MAX_VALUE;

        System.out.println("Số nhỏ hơn:" + min);
        System.out.println("Số lớn hơn:" + max);
        // in so chan trong mang
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] % 2 == 0) {
                System.out.println("Số chẵn:" + mang[i]);
            }
        }
        // in so chan trong mang
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] % 2 == 0) {
                if (max < mang[i]) {
                    max = mang[i];

                }
            }
        }
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] % 2 == 0) {
                if (minn > mang[i]) {
                    minn = mang[i];

                }
            }
        }
        System.out.println("Max số chẵn:" + max);
        System.out.println("Min số chẵn:" + minn);
    }


    // tim max la so chan trong mang -> ve ra paint
    // tim min la so chan trong mang -> ve ra paint

}
