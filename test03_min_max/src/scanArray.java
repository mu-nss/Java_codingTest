import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class scanArray {
    public static void main(String[] args) throws IOException {
        // 1. Scanner + Array
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[] intArr = new int[num];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = scan.nextInt();
        }

        Arrays.sort(intArr);
        System.out.println(intArr[0] + " " + intArr[num- 1]);

    }
}