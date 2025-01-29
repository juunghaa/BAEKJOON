import java.util.*;

public class P11659 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 첫째줄 개수N과 합을 구해야하는 횟수 M이주어짐
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // 둘째줄 N개의 수 주어짐
        int[] arrN = new int[N];
        int[] arrSum = new int[N];
        arrN[0] = scanner.nextInt();
        arrSum[0] = arrN[0];
        for (int i = 1; i < N; i++) {
            arrN[i] = scanner.nextInt();
            arrSum[i] = arrSum[i - 1] + arrN[i];
        }
        for (int k = 0; k < M; k++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            if (i != 1) {
                System.out.println(arrSum[j - 1] - arrSum[i - 2]);
            } else {
                System.out.println(arrSum[j - 1]);
            }
        }
    }
}
// 출력은 i-j구간 합 M개
