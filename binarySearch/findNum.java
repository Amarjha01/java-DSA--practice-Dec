package binarySearch;

public class findNum {

    static boolean findtarget(int[] arr, int  target){
        int size = arr.length;
        int  st = 0, end = size-1;

        while (st <= end) {
        int mid = st + (end-st)/2;
        if(target==arr[mid]){
            return true;
        }else if (target > arr[mid]){
            st = mid+1;
        }else{
            end = mid-1;
        }
        }

      return false;
    }
    public static void main(String[] args){
        int arr[] = {2,4,5,3,6,2,3,26,7};
        int target = 6;

        System.out.println(findtarget(arr, target));
    }
   
}
