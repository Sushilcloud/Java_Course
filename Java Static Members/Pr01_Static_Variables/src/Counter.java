public class Counter {
    // Static variable to keep track of the count of instances
    private static int count=0;

    // Constructor increments the static variable count
    public Counter()
    {
        count++;
    }

    // Static method to get the value of count
    public static int getCount()
    {
        return count;
    }

    public static void main(String[] args)
    {
        // create several Counter objects
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
        Counter c4=new Counter();

        // Print the value of count
        System.out.println("Count: " + Counter.getCount());
    }
}
