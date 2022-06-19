package gfgDailyCodes;

public class Day1_1_18062022 {
    public static void main(String [] args)
    {
        System.out.println("hello");
        int arr[]={10,20,15};
        int curr[]={};
        int sumGiven=30;
        int sum=subsetElementSum(arr,curr,0);
    }
    static int subsetElementSum(int arr[],int curr[],int index)
    {
        int sum=0;
        if(index==arr.length)
        {
            return -1;
        }

        subsetElementSum(arr,curr,index+1);
        //subsetElementSum(arr,curr+arr[index],index+1);

        return sum;
    }
}