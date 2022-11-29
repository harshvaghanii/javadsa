package ArrayList;

import java.util.*;

public class Sorting {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(46);
        list.add(23);
        list.add(52);
        list.add(2);
        list.add(26);
        list.add(4);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}