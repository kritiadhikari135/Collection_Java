
import java.util.LinkedList;

public class CreatingLinkedList {
    public static void main(String [] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(20);
        list.add(39);
        list.add(6);
        list.add(24);
        System.out.println(list);
        System.out.println(list.getLast());
        list.add(1,42);
        list.set(3,12);
        System.out.println(list);
        System.out.println(list.contains(12));
    }
    
}
