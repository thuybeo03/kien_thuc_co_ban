package DaHinh;

public class Main {
    public static void main(String[] args) {
        DaHinh daHinh = new DaHinh();
        DaHinh1 daHinh1 = new DaHinh1();
        DaHinh2 daHinh2 = new DaHinh2();

        daHinh.test();
        daHinh1.test();
        daHinh2.test();



        DaHInhTinh daHInhTinh = new DaHInhTinh();
        daHInhTinh.show(100);                // Hiển thị số nguyên
        daHInhTinh.show(123.45);             // Hiển thị số thực
        daHInhTinh.show("Hello, World!");    // Hiển thị chuỗi
        System.out.println();
    }

}
