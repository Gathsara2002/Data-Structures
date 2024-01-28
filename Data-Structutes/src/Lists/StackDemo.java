package Lists;

import java.util.Stack;

/**
 * @author : Gathsara
 * created : 1/28/2024 -- 2:38 PM
 **/

//vector class eka override vela hadila tiyenne
//Behavior එක - FILO (First In Last Out)  or LIFO (Last In First Out)

public class StackDemo {
    public static void main(String[] args) {

        //initializing
        Stack<Integer> stack = new Stack<>();

        //put values
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //print
        System.out.println(stack.toString());

        //remove lastone
        stack.pop();
    }
}
