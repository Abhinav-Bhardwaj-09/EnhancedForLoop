package array_methods;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 27-02-2021
 * Time: 16:37
 */

public class Array_Methods {
    private int [] arr;
    private int index = 0;
    public void initialize_Array (int size) {
        arr = new int[size];
    }


    public void insert_Element (int element) {
        arr[index] = element;
        index++;
    }

    public void display_Array () {
        int i = 0;
        for(int item : arr){         // enhanced for loop iterating array elements in "item" variable
            if (i != 0) {
                System.out.print(", " + item);
            }
            else {
                System.out.print(item);
                i++;
            }

        }
    }
}
