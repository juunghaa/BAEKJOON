import java.util.Scanner;
import java.util.Arrays;

public class P11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        int sum = 0;
        N = scanner.nextInt();
        String num;
        num = scanner.next();

        char[] arr = new char[N];
        arr = num.toCharArray();

        for (int i = 0; i < N; i++) { // num.length == N 맞는지 확인 필요
            int ascii = 0;
            ascii = num.charAt(i) - 48;
            sum += ascii;
        }

        System.out.println(sum);
    }
}
