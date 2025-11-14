import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator{
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(45);
        list.add(30);

        ListIterator<Integer> it = list.listIterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}