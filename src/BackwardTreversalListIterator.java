// import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class BackwardTreversalListIterator{
   public static void main(String args[]){
     List<Integer> list = new ArrayList<>();
    list.add(34);
    list.add(32);
    list.add(23);
    list.add(56);

    ListIterator<Integer> it = list.listIterator(list.size());

    while(it.hasPrevious()){
        System.out.println(it.previous());
        // int x = it.previous();
        // it.set(x*2);

    }
    // System.out.println(list);
    while(it.hasNext()){
        int x = it.next();
        it.set(x*2);
        // System.out.println(list);
    }
    System.out.println(list);
   }



}