import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BTListIteratorArray {
    public static void main(String [] args){
        List<Integer> list = new ArrayList<>();
        list.add(78);
        list.add(67);
        list.add(23);
        list.add(345);

        ListIterator<Integer> it = list.listIterator(list.size());

        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
    }


}
