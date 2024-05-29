package apnaCollege;

public class ChocolateDistribution {
    public static int[] sortArr(int[] arr){
        for(int i =0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    static void chocolateDistribution(int[]arr, int m){
        int diff = Integer.MAX_VALUE;
        int[] sorted = sortArr(arr);
        for(int i=0;i<arr.length-m+1;i++){
            if(diff>sorted[i+m-1]-sorted[i]){
                diff=sorted[i+m-1]-sorted[i];
            }
        }
        System.out.println(diff);

    }
    public static void main(String[] args){
        int[] arr = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m = 7;
        chocolateDistribution(arr,m);
    }
}
