import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numers={25,48,65,47,98};

        // print the array before sorting
        System.out.println("Before Sort"+ Arrays.toString(numers));

        // sort the array
        Arrays.sort(numers);

        // after sorting the array
        System.out.println("After sorting"+Arrays.toString(numers));

        String[] name={"Sushil","Ravi","Akash","Zenith"};

        // print before sorting the array
        System.out.println("Before sort:"+Arrays.toString(name));

        // after sorting the array

        Arrays.sort(name);
        System.out.println("After sort String"+Arrays.toString(name));

    }
}