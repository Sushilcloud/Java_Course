public class Main {
    public static void main(String[] args) {

        // Declare the two dimensional integer array 'a' with dimension 10*10
        int [][] a=new int[10][10];

        // use nested loop to iterate over each row and column of the array

        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++)
            {
                System.out.printf("%2d",a[i][j]);
            }
            System.out.println("");
        }

    }
}