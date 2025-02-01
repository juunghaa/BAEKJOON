import java.util.*;

public class S2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        while (end_index != N) {
            if (sum == N) {
                count++;
                end_index++;
                sum += end_index;
                // end인덱스를 확장하고 더해주어야 함
            } else if (sum > N) {
                sum -= start_index;
                start_index++;
                // 빼고 나서 start인덱스를 확장하여야 함
            } else {
                end_index++;
                sum += end_index;
            }
        }
        System.out.println(count);
    }

}
