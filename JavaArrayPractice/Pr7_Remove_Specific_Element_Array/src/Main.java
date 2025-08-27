import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int[] my_Array={25,14,56,15,36,56,77,18,29,49};


        // print the original array using Array.toString()
        System.out.println("Original Array:="+Arrays.toString(my_Array));

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter index to remove");
        int removeIndex=scanner.nextInt();
        System.out.println("Length of Array"+my_Array.length);
        for(int i=removeIndex;i<my_Array.length-1;i++)
        {
            my_Array[i]=my_Array[i+1];
        }
        System.out.println(Arrays.toString(my_Array));

    }
}