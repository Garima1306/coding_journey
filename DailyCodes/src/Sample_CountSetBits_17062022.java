public class Sample_CountSetBits_17062022 {

    static int count=0;
    public static void main(String[] args)
    {
        //System.out.println("Hello");

//        int num=5;
//        int anscount=countSetBits(num);
//        System.out.println("count: "+anscount);
        int num=5;
        int count=0;
        while(num>0)
        {
            if((num&1)==1)
            {
                count++;
            }
            num=num>>1;
        }
        System.out.println(count);

    }
//    public static int countSetBits(int num)
//    {
//        if(num==0)
//        {
//            return -1;
//        }
//        if(num%2==1)
//        {
//            count++;
//        }
//        System.out.println(num%2);
//            countSetBits(num/2);
//
//            return count;
//    }
}
