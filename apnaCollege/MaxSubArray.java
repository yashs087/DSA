package apnaCollege;

public class MaxSubArray {


    static void maxSubArray(int[] arr){
//        printArr(arr);
        int maxSum=0;
        int sum = 0;
        for(int i : arr){
            sum = sum+i;
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] Args){
        int[] arr = {5,4,-1,7,8};
        maxSubArray(arr);
    }
}
