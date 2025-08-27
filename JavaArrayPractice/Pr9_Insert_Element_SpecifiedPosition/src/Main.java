import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int[] my_Array={10,20,30,40,50,60};

        // print the old array
        System.out.println("Old Array"+ Arrays.toString(my_Array));

        System.out.println("Enter number to insert");
        Scanner scanner=new Scanner(System.in);
        int enterNum=scanner.nextInt();

        System.out.println("Enter Position ");
        int index=scanner.nextInt();
        System.out.println("Length of Array"+my_Array.length);
       // int[] newArray=new int[my_Array.length];
        for(int i=my_Array.length-1;i>index;i--)
        {
            my_Array[i]=my_Array[i-1];
            System.out.println(" "+my_Array[i]);

        }
        my_Array[index]=enterNum;

        System.out.println("New Array"+Arrays.toString(my_Array));
    }
}