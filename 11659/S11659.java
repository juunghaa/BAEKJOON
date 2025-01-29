import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//버퍼 입력을 이용해볼게 ~~~~~~
//Scanner보다 입력 속도가 빠름
public class S11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        // 바로바로 배열을 만들거야. 합배열도!
        long[] S = new long[suNo + 1]; // long형을 습관적으로 선언해주자!

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i <= suNo; i++) {
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
            // 이전 합 배열에 현재 입력 값을 더해 합 배열을 생성함
            // 즉 입력과 동시에 합 배열을 생성하고 있는 것임
        }
        for (int q = 0; q < quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i - 1]);
            // S[0]=0으로 두어 인덱스 변환의 복잡성 따지지 않고 구하고자 하는 값들을
            // 출력할 수 있게 됨
        }
    }
}
