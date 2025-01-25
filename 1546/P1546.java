import java.util.Scanner;

public class P1546 {
    private int N; // 시험 본 과목의 개수 N
    private int scoreIntArr[]; // 둘째 줄에 세준이의 시험 점수가 주어짐
    private double scoreCopy[];
    private double avg;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int scoreIntArr[] = new int[N];
        double scoreCopy[] = new double[N];
        for (int i = 0; i < N; i++) {
            scoreIntArr[i] = scanner.nextInt();
        }

        // 최댓값 고르기
        int max = 0;
        for (int score : scoreIntArr) {
            if (max < score) {
                max = score;
            }
        }

        // 성적 위조하기기
        for (int i = 0; i < N; i++) {
            double scoreFake = 0;
            scoreFake = (double) scoreIntArr[i] / max * 100;
            scoreCopy[i] = scoreFake;
        }

        // 평균 구하기
        double sum = 0;
        for (double scr : scoreCopy) {
            sum += scr;
        }
        double avg = sum / (double) N;

        System.out.println(avg);
    }
}
