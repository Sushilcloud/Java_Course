import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter First Number");
        double x=in.nextDouble();
        System.out.println("Enter Second Number");
        double y=in.nextDouble();
        System.out.println("Enter Third Number");
        double z=in.nextDouble();
        System.out.print("small number is"+ smallestNumber(x,y,z));
        }

        public static double smallestNumber(double x, double y, double z)
        {
        return Math.min(Math.min(x,y),z);
        }
}