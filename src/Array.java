public class Array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println("Các phần tử đang có :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] );
        }
        System.out.println("Kích thước của mảng: " + arr.length);

        double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println("Phần tử đầu tiên trong mảng double: " + doubleArray[1]);
    }

}
