public class Main {
    public static void main(String[] args) {

        int[] my_Array={1789,1854,2013,2025,2045,1452,8956};

        boolean a=contain(my_Array,1452);
        boolean b=contain(my_Array,1470);

        System.out.println(a);
        System.out.println(b);

    }

    public static boolean contain(int[] arr, int item)
    {
        for(int n:arr)
        {
            if(item==n)
            {
                return true;
            }
        }
        return false;
    }


}