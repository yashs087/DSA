package apnaCollege;

public class ContainsDuplicate {

    static void containsDuplicate(int[] arr){
        int max = -1;
        for(int i: arr){
            if(max<i){
                max=i;
            }
        }
        int[] newArr = new int[max+1];
        boolean isDuplicate = false;
        for(int i : arr){
            if(newArr[i]==1){
                System.out.println(true);
                isDuplicate = true;
                break;
            }
            newArr[i]=1;
        }
        if(!isDuplicate){
            System.out.println(isDuplicate);
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,1,4};
        containsDuplicate(arr);
    }
}
