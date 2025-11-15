import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FTListIteratorArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(43);
        list.add(6546);
        list.add(78);

        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
    
}
