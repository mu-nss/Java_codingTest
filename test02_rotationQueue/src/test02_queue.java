import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.LinkedList;
import java.util.StringTokenizer;
public class test02_queue {

    static LinkedList<Integer> deq = new LinkedList<Integer>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer strToken = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(strToken.nextToken()); // 큐의 크기
        int m = Integer.parseInt(strToken.nextToken()); // 뽑아내려고 하는 요소의 수
        int cntMin = 0; // 연산의 최소값

        int[] mArr = new int[m]; // 뽑아내려고 하는 요소(m)의 수를 배열에 저장

        // n개의 원소를 저장
        for (int i = 1; i <= n; i++) {
            deq.offer(i);
        }

        strToken = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            mArr[i] = Integer.parseInt(strToken.nextToken());
        }

        for (int i = 0; i < m; i++) {
            int idxTarget = deq.indexOf(mArr[i]);
            int idxMiddle = (deq.size() % 2 == 0) ? deq.size() / 2 - 1 : deq.size() / 2;

            if (idxTarget <= idxMiddle) {
                for (int j = 0; j < idxTarget; j++) {
                    int back = deq.pollFirst();
                    deq.offerLast(back);
                    cntMin++;
                }
            } else {
                for (int j = 0; j < deq.size() - idxTarget; j++) {
                    int front = deq.pollLast();
                    deq.offerFirst(front);
                    cntMin++;
                }
            }
            deq.pollFirst();
        }

        System.out.println(cntMin);
    }
}

