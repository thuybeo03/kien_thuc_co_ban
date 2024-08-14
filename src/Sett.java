import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sett {
    public static void main(String[] args) {
//        hashSet ko duy trì thứ tự
        Set<String> abc = new HashSet<>();
        abc.add("abc1");
        abc.add("abc2");
        abc.add("abc3");
        System.out.println("HashSet: ");
        for (String s : abc) {
            System.out.println(s);
        }
        if (abc.contains("abc3")) {
            System.out.println("co acb3");
        }
        abc.remove("abc3");
        System.out.println("HashSet: ");
        for (String s : abc) {
            System.out.println(s);
        }
//set ko nhận trùng
        abc.add("abc1");
        abc.add("abc2");
        abc.add("abc3");
        abc.add("abc1");
        System.out.println("HashSet : ");
        for (String s : abc) {
            System.out.println(s);
        }
//linkeHashSet duy trì thứ tự thêm vào
        Set<String> abcd = new LinkedHashSet<>();
        abcd.add("abcd1");
        abcd.add("abcd2");
        abcd.add("abcd3");
        System.out.println("LinkedHashSet: ");
        for (String s : abcd) {
            System.out.println(s);
        }
        //TreeSet duy trì sắp xếp tự nhiên
        Set<String> abcdee = new TreeSet<>();
        abcdee.add("abcaa");
        abcdee.add("abc2ádâsdsdsa");
        abcdee.add("abc3sadasd");
        System.out.println("HashSet: ");
        for (String s : abcdee) {
            System.out.println(s);
        }

    }


}
