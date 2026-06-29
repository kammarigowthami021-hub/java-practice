import java.util.Scanner;
public class LargestElement {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    sc.close();
    int ans = findLargest(arr);
    System.out.println(ans);

} 
static int findLargest(int[] arr){
    int largest = arr[0];
    for(int i = 0;i<arr.length;i++){
        if(arr[i]>largest){
            largest = arr[i];
        }
    }
    return largest;

}

}
