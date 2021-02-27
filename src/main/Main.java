package main;

import array_methods.Array_Methods;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 27-02-2021
 * Time: 16:38
 */
    
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size_array = sc.nextInt();
        System.out.println();

        Array_Methods arr_mthd = new Array_Methods();
        arr_mthd.initialize_Array(size_array);              // initialize array with size as size_array
        int element, i = 0;
        while (i < size_array) {
            System.out.print("Enter the value of element: ");
            element = sc.nextInt();
            arr_mthd.insert_Element(element);
            System.out.println();
            i++;
        }
        System.out.println("\n\n\n");
        System.out.print("Inserted Array:   ");
        arr_mthd.display_Array();
    }
}