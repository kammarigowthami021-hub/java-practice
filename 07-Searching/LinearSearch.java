
public class LinearSearch {
    public static void main(String[] args){
        int [] arr = {23,34,45,56,67,7889};
        int target = 36;
  int ans = searchElement(arr, target);
  System.out.println(ans);
    }

    static int searchElement(int[] arr,int target){
        for(int i = 0;i<arr.length;i++){
            if(target == arr[i]){
                return i;
            }
        }
return -1;
    }
}
