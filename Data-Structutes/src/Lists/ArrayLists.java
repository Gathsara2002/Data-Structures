package Lists;

import java.util.List;
import java.util.ArrayList;

/**
 * @author : Gathsara
 * created : 1/28/2024 -- 12:48 PM
 **/

//list interface eken extend vela tiyenne
//Dynamic size, data store කරන්න පුලුවන් container එකක්.

public class ArrayLists {
    public static void main(String[] args) {

        //me array list ekata string,integer,boolen okkoma danna puluvn
        List list=new ArrayList();

        //mekata danna puluvn string vitarai
        List<String> list1=new ArrayList<>();

        list1.add("red");
        list1.add("yellow");
        list1.add("blue");

        //print
        System.out.println(list1);
        list1.forEach(System.out::println);

        //get one element
        String color = list1.get(0);
        System.out.println(color);
    }
}
