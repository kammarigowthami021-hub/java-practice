
import java.util.Scanner;
import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = new String[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.next();
        }
sc.close();
        System.out.println(Arrays.toString(array));
        array[0] = "gow";
        System.out.println(Arrays.toString(array));

    }
}