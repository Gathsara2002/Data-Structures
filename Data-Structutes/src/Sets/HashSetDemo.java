package Sets;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Gathsara
 * created : 1/28/2024 -- 4:10 PM
 **/

//sets valadi duplicate values tiyaganne
//data store karanna order ekak ne
//set ekata denne class ekak nm equals(), hashCode() class eke override karala tiyenna ona.nattn duplicate values dammath(duplicate properties with objects) set eken remove karanne


public class HashSetDemo {
    public static void main(String[] args) {

        //Initialize
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);

        System.out.println(set.size());  //3
        set.forEach(System.out::println);

        set.remove(1);

        System.out.println(set.size());  //2
        System.out.println(set.toString());  //[2, 3]

    }
}
