import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[5];
        for(int i = 0;i<arr.length;i++){
          arr[i] = sc.nextInt();
        }
        sc.close();
        int ans = findSum(arr);
        System.out.println(ans);
        


    }
    static int findSum(int[]arr){
        int sum = 0;
        for( int nums:arr){
            sum=sum+nums;   
        }
        return sum;


    }
    
}
