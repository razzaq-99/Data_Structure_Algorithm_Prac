
import java.util.*;

public class LL2 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        System.out.println(list);

        list.addLast("List");
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.print("null");

//        System.out.println();
//        list.removeFirst();
//        System.out.println(list);
//
//        System.out.println();
//        list.removeLast();
//        System.out.println(list);

        System.out.println();
        list.remove(2);
        System.out.println(list);

    }
}
