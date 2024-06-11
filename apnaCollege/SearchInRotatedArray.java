package apnaCollege;

public class SearchInRotatedArray {
    static boolean found =false;
    static void search(int[] arr, int n){
        if(arr[0]==n){
            System.out.println(0);
            found=true;
        }
        else if(arr[0]>n){
            for(int i = arr.length-1;i>0;i--){
                if(arr[i]==n){
                    System.out.println(i);
                    found=true;
                }
            }
        }
        else {
            for(int i=1;i<arr.length-1;i++){
                if(arr[i]==n){
                    System.out.println(i);
                    found=true;
                }
            }
        }
        if(!found){
            System.out.println("not found");
        }
    }


    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};
        int n = 0;

        search(arr,n);
    }
}
