public class Main {
    public static void main(String[] args) {

        // declare an array
        int[] my_Array={2,4,8,20};
        int sum=0;
        for (int i:my_Array)
        {
            sum=sum+i;
        }
        System.out.println(sum);
        double avg=(double) sum/my_Array.length;
        System.out.println("Length of Array="+my_Array.length);
        System.out.println("Average value is="+ avg);
    }
}