import java.util.OptionalInt;
import java.util.Scanner;

public class Main {
    // define a method findIndex that search for an integer t in an integer array my_arr
    public static OptionalInt findIndex(int[] my_arr,int t) {
        // check if the array is null and return an empty OptionalInt if it is
        if (my_arr == null) {
            return OptionalInt.empty();
        }
        // get the length of array
        int len = my_arr.length;
        int i = 0;
        // iterate through the element in the array
        while (i < len) {
            // check if the current element is equal to t and return its index as an OptionalInt
            // if found
            if (my_arr[i] == t)
                return OptionalInt.of(i);
                else
                i = i + 1;
            }

        // if t is not found in the array ,return an empty OptionalInt
            return OptionalInt.empty();

    }


    public static void main(String[] args) {

        // declare of array elememnt

        int[] my_Array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

    findIndex(my_Array,25).ifPresent(System.out::println);
        findIndex(my_Array,15).ifPresent(System.out::println);

    }
}

