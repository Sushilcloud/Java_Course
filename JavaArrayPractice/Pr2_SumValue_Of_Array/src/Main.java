public class Main {
    public static void main(String[] args)
    {
     // array
        int[] my_array={2,3,4,5};

    // declare the initilize variable zero
        int sum=0;

        // iterate over each element of the array using an enchanced for loop
        for(int i: my_array)
        {
            sum=sum+i;

        }
        System.out.println("Sum of the Array= "+sum);
    }
}