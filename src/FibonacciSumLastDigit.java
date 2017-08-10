import java.util.*;

public class FibonacciSumLastDigit {
    private static long getFibonacciSumNaive(long n) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1, next=0;
        long sum      = 0,rem,seq=1;
        int i ;

        for (i = 0; i < 1000; i++) {
            if(i==n)
                return next;
            next = (previous + current) % 10;
            previous = current;
            current = next;

            if (previous == 0 && current == 1) {
                seq = i+1;
                break;
            }
        }
        rem=n%seq;
        System.out.println("rem "+rem+" Seq "+seq);
        if (rem<=1)
            return rem;

        for ( i = 0; i < rem; ++i) {
            //tmp_previous = previous;
            current = (previous + current);
            previous = current;

            sum += current;
        }

        return sum % 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibonacciSumNaive(n);
        System.out.println(s);
    }
}

