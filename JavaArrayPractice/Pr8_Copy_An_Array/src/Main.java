import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // declare an Array

        int[] array={25,14,10,20,40,30,50};

        int[] newArray=new int[7];

        // print the old array
        System.out.println("Original Array"+ Arrays.toString(array));

        // loop to copy each element from souce array to new array

        for(int i=0;i<array.length;i++)
        {
            newArray[i]=array[i];
        }

        System.out.println("New Arrays"+Arrays.toString(newArray));
    }
}