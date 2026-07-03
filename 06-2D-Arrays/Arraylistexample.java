import java.util.ArrayList;
import java.util.Scanner;
public class Arraylistexample {
    public static void main(String[] args){
        ArrayList <Integer> array = new ArrayList<>(10);
        //manually
        array.add(76);
        // user input
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<5;i++){
            array.add(sc.nextInt());
        }
        for(int i = 0;i<5;i++){
            System.out.print(array.get(i));
        }
        System.out.println(array);
        


    }
    
}
