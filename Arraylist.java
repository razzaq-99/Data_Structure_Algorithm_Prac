import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(9);
        list.add(4);

        System.out.println(list);


        Collections.sort(list);
        System.out.println(list);
    }
}
