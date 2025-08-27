import java.util.Scanner;

public class Main {


    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First number");
        int firstNum=input.nextInt();

        System.out.println("Enter First number");
        int secondNum=input.nextInt();

        System.out.println("Enter First number");
        int thirdNum=input.nextInt();

        System.out.println("Average of three numbers"+average(firstNum,secondNum,thirdNum));

    }

    public static int average(int firstNum,int secondNum, int thirdNum)
    {
        return (firstNum+secondNum+thirdNum)/3;
    }


}