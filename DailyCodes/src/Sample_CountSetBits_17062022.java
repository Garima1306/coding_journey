public class Sample_CountSetBits_17062022 {

    static int count=0;
    public static void main(String[] args)
    {
        //System.out.println("Hello");

        int num=5;
        int anscount=countSetBits(num);
        System.out.println("count: "+anscount);

    }
    public static int countSetBits(int num)
    {
        if(num==0)
        {
            return -1;
        }
        if(num%2==1)
        {
            count++;
        }
        System.out.println(num%2);
            countSetBits(num/2);

            return count;
    }
}
