package Array;

public class MinMaxElement {
    public static class Pair
    {
        int max;
        int min;
    }
    public static Pair getMinMax(int[] arr, int n)
    {
        Pair MinMax =new Pair();
        if(n==1)
        {
            MinMax.max=arr[0];
            MinMax.min=arr[0];
        }
        if(arr[0]>arr[1])
            {
                MinMax.max=arr[0];
                MinMax.min=arr[1];
            }
            else{
                MinMax.max=arr[1];
                MinMax.min=arr[0];
            }
        for(int i=2;i<n;i++)
        {
            if(arr[i]> MinMax.max){
                MinMax.max=arr[i];}
            else if(arr[i]< MinMax.min){
                MinMax.min=arr[i];
            }
        }
        System.out.println(MinMax.min);
        System.out.println(MinMax.max);
         return MinMax;
    }
    public static void main(String[]arg){
        int[] arr={100,1,2,3,3000};
        getMinMax(arr, arr.length);
    }
}
