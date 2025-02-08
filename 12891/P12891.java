import java.util.*;

class DnaCheck {
    public static int N;
    public static int M;
    public static String password = "";
    public static char[] dna = password.toCharArray();
    public static int Anum;
    public static int Cnum;
    public static int Gnum;
    public static int Tnum;
    public static int Acount = 0;
    public static int Ccount = 0;
    public static int Gcount = 0;
    public static int Tcount = 0;
    public static int value = 0;
}

public class P12891 {
    public static void main(String[] args) {
        DnaCheck c = new DnaCheck();
        Scanner sc = new Scanner(System.in);
        c.N = sc.nextInt();
        c.M = sc.nextInt();
        c.password = sc.next();
        c.dna = c.password.toCharArray();
        c.Anum = sc.nextInt();
        c.Cnum = sc.nextInt();
        c.Gnum = sc.nextInt();
        c.Tnum = sc.nextInt();

        // i에서부터 j 범위까지 i포인터를 옮겨가면서 수를 증가시켜야함
        // 그리고 증가시킨 수들의 값을 비교해서 가능한지 아닌지 판단
        for (int i = 0; i < c.M; i++) {
            PlusCount(c, i);
        }
        judgeWindow(c);
        if (c.M < c.N) { // 윈도우를 옮길게 남아있으면면
            int j = 0;
            for (int i = c.M; i < c.N; i++) {
                MinusCount(c, j);
                PlusCount(c, i);
                judgeWindow(c);
                j++;
            }

        }

        System.out.println(c.value);
    }

    public static void PlusCount(DnaCheck c, int i) {
        switch (c.dna[i]) {
            case 'A':
                c.Acount++;
                break;
            case 'C':
                c.Ccount++;
                break;
            case 'G':
                c.Gcount++;
                break;
            case 'T':
                c.Tcount++;
                break;
        }
    }

    public static void MinusCount(DnaCheck c, int i) {
        switch (c.dna[i]) {
            case 'A':
                c.Acount--;
                break;
            case 'C':
                c.Ccount--;
                break;
            case 'G':
                c.Gcount--;
                break;
            case 'T':
                c.Tcount--;
                break;
        }
    }

    public static void judgeWindow(DnaCheck c) {
        if (c.Acount >= c.Anum && c.Ccount >= c.Cnum && c.Gcount >= c.Gnum && c.Tcount >= c.Tnum) {
            c.value++;
        }
    }
}
