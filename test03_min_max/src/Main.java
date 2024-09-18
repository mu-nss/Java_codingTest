// 10818: 최소, 최대

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 2. BufferedReader + Array
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        StringTokenizer strToken = new StringTokenizer(br.readLine(), " ");

        int index = 0;
        int[] arr = new int[num];
        while (strToken.hasMoreTokens()) {
            arr[index] = Integer.parseInt(strToken.nextToken());
            index++;
        }

        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[num - 1]);
    }
}