import java.util.Scanner;
public class CalculateAverage {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt(); 
        }
        sc.close();
        int ans = calAverage(arr);
        System.out.println(ans);
    }
    static int calAverage(int[] arr){
        int sum = 0;
        for(int nums:arr){
            sum +=nums;
        }
        int avg = sum/arr.length;
        return avg;
    }
    
    
}
