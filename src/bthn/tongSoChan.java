package bthn;

public class tongSoChan {
    public static void main(String[] args) {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 40, 60, 100};
        int tong = 0;
        int soChan = 0;
        int soChan1 = 0;
        int soChan2 = 0;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] % 2 == 0) {
                tong += mang[i];
            }
        }
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] % 2 == 0) {
                soChan++;
            }
        }
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] % 2 == 0 && mang[i] < 500) {
                soChan1++;
            }
        }
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] % 2 == 0 ) {
                soChan2 = mang[i];
            }
        }
        System.out.println("Tổng số chẵn: " + tong);
        System.out.println("So luong số chẵn: " + soChan);
        System.out.println("So luong số chẵn < 500: " + soChan1);
        System.out.println("So chan cuoi cung : " + soChan2);

    }
}
