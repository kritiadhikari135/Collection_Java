package Stream.Stream;

import java.io.*;
import java.util.*;

public class Average {
    public static void main(String[] args){
        int arr[] = {30,20,10};
        double ave = Arrays.stream(arr).average().getAsDouble();
        System.out.println(ave);


    }

}
