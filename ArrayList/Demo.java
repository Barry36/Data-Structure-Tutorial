package ArrayList;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        int[] ids = {-3, 0, 100};
        ArrayList<Integer> values = new ArrayList<>();

        // Add all the ints as Integers with add.
        // ... The ints are cast to Integer implicitly.
        for (int id: ids) {
            values.add(id);
        }

        System.out.println(values);
        // The collections have the same lengths.
        System.out.println(values.size());
    }
}
