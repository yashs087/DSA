package apnaCollege;

public class ReverseTheArray {

    static void reverse(int[] arr){
        int[] reversed = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            reversed[i]= arr[arr.length-i-1];
        }
        for(int i : reversed){
            System.out.print(i+" ");
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reversedwithoutarr(int[] arr){
        for(int i=0; i<arr.length/2;i++){
            swap(arr, i, arr.length-i-1);
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String args[]){
        int[] arr = {4,3,7,9,2};
//        reverse(arr);
        reversedwithoutarr(arr);
    }
}
