import java.util.ArrayList;

public class ArrayL<I extends Number> {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        for (Integer number : numbers) {
            System.out.println(number);
        }


        ArrayList<String> spring1= new ArrayList<>();
        spring1.add("Thuy");
        spring1.add("Beo");
//get
        String getOne = spring1.get(0);
        System.out.println( "GetOne :" + getOne);
//size
        int size= spring1.size();
        System.out.println( "Size :" + size);

        ArrayList<String> spring2 = new ArrayList<>();
        spring2.add("Thuy1");
        spring2.add("Bezo1");

        spring1.addAll(spring2);
        System.out.println("ArrayList addAll: " );
        for (String s : spring1) {
            System.out.println(s);
        }

        ArrayList<String> spring3 = new ArrayList<>();
        spring3.add("Thuy2");
        System.out.println("Arr:" + spring3);
//        spring3.clear();
        System.out.println("ArrayList clear: " + spring3.size());

        System.out.println("Kích thước của ArrayList: " + numbers.size());
        System.out.println("Phần tử tại vị trí 1: " + numbers.get(1));

        System.out.println("Các phần tử lớn hơn 15:");
        numbers.stream()
                .filter(n -> n > 15)
                .forEach(System.out::println);
//        numbers.stream():  Chuyển ArrayList numbers thành một Stream
        //filter : lọc
    }

}
