package Maps;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Gathsara
 * created : 1/28/2024 -- 4:36 PM
 **/

//key , value pairs vidihata data store karaganne
//key eka duplicate karanna be
//duplicate key tibbot latest value eka tamai store karaganne


public class HashMapDemo {
    public static void main(String[] args) {

        //Initialize
        Map<Integer, String> map = new HashMap<>();

        //add values
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(3,"D");
        map.put(4,"D");

        System.out.println(map); //{1=A, 2=B, 3=D, 4=D}
    }
}
