import java.util.Scanner;
public class EvenOdd {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i = 0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        even_odd(arr);
        sc.close();
    }
     static  void even_odd(int[] arr){
       int  count1 = 0;
       int count2 = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2==0){
                count1++;  
            }
            else{
                count2++;
            }  
        }
        System.out.println("even: "+count1);
        System.out.println("odd: "+count2);
     } 
}
