import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PCalc {
    private static List<Integer> optimal_sequence(int n) {
        List<Integer> sequence = new ArrayList<Integer>();
        int[] table = new int[n + 1];
        table[1] = 0;
        for (int i = 2; i <= n; i++) {
            int a = (i % 2) == 0 ? table[i / 2] : Integer.MAX_VALUE;
            int b = (i % 3) == 0 ? table[i / 3] : Integer.MAX_VALUE;
            int c = table[i - 1];
            table[i] = Math.min(a, Math.min(b, c)) + 1;
        }
        sequence.add(n);
        // how to backtrack? from n to 1...
        // 1) BZ: find the first cell one step smaller?
        // 2) find if n/2, n/3, n-1 >= 1, and
        // if t[n] - 1 = t[n/2], add n/2, n/=2;
        // if t[n] - 1 = t[n/3], add n/3, n/=3;
        // if t[n] - 1 = t[n-1], add n-1, n-=1;
        while (n > 1) {  // BZ: n > 0? when n==1, falls in no cases
            if(n / 2 >= 1 && table[n] - 1 == table[n / 2]) {
                sequence.add(n / 2);
                n /= 2;
            }
            else if(n / 3 >= 1 && table[n] - 1 == table[n / 3]) {
                sequence.add(n / 3);
                n /= 3;
            }
            else if(n - 1 >= 1 && table[n] - 1 == table[n - 1]) {
                sequence.add(n - 1);
                n -= 1;
            }
        }
        Collections.reverse(sequence);
        return sequence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> sequence = optimal_sequence(n);
        System.out.println(sequence.size() - 1);
        for (Integer x : sequence) {
            System.out.print(x + " ");
        }
        scanner.close();
    }
}
