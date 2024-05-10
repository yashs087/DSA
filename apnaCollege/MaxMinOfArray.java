package apnaCollege;

public class MaxMinOfArray {

    static void maxMin(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i: arr){
            min = Integer.min(min,i);
            max = Integer.max(max, i);
        }
        System.out.println("min value: "+min);
        System.out.println("max Value: "+ max);
    }
    public static void main(String[] args){


        int arr[] = {3, 5, 4, 1, 9};
        maxMin(arr);

    }
}
