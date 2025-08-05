import java.util.*;
public class ArrayList1D {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1,4);
        System.out.println(list.contains(4));
        list.set(1,2);
        System.out.println(list.get(3));
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
