import java.util.LinkedList;

public class LinkedListOne {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        list.addFirst("First");
        list.addLast("Last");
        String first = list.getFirst();
        String last = list.getLast();

        list.removeFirst();
        list.removeLast();
        System.out.println("List: " );
        for (String s : list) {
            System.out.println(s);
        }
        list.push("Push");
        list.pop();
        System.out.println("One: " + list);

        list.offer("Offer");
        System.out.println("offer: " + list);
    }
}
