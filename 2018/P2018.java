import java.util.*;

public class P2018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            sum += i;
            for (int j = (i + 1); j <= N + 1; j++) {
                if (sum == N) {
                    count++;
                    break;
                } else if (sum < N) {
                    sum += j;
                    continue;
                } else if (sum > N) {
                    break;
                }
            }

        }

        System.out.println(count);
    }
}
