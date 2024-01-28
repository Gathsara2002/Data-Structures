package Arrays;

/**
 * @author : Gathsara
 * created : 1/28/2024 -- 11:20 AM
 **/

//same data type store karaganna use karana container ekak
//fixed length ekak tiyenne

public class ArrayDemo {
    public static void main(String[] args) {

        // Declaration and Initialization
        int[] arr = new int[5]; // Creating an integer array of size 5

        // Accessing elements
        arr[0] = 10; // Assigning value 10 to the first element
        int value = arr[2]; // Accessing the third element
        System.out.println("value: " + value);

        //Iterating array
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
