import java.util.HashSet;
import java.util.Set;

public class Sett {
    public static void main(String[] args) {
        Set<String> abc = new HashSet<>();
        abc.add("abc1");
        abc.add("abc2");
        abc.add("abc3");
        System.out.println("HashSet: " );
        for (String s : abc){
            System.out.println(s);
        }
        if (abc.contains("abc3")){
            System.out.println("co acb3");
        }
        abc.remove("abc3");
        System.out.println("HashSet: ");
        for (String s : abc){
            System.out.println(s);
        }
    }
}
