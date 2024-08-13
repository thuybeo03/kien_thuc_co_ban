import java.util.ArrayList;
import java.util.List;

public class Listt {
    public static void main(String[] args) {
        List<String> abc = new ArrayList<>();
        abc.add("abc1");
        abc.add("abc2");
        abc.add("abc3");

        System.out.println("Danh sach :");
        for (String s : abc) {
            System.out.println(s);
        }
        String first = abc.get(0);
        String offer = abc.get(2);
        System.out.println("first:"  +first  );
        System.out.println("offer:"  +offer);
    }
}
