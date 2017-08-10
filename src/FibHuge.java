import java.util.*;

public class FibHuge {

    private static long getFibonacciHugeNaive(long n, long m) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;
        long next=0,seq=1,rem;
        int i ;

        for (i = 0; i < m * m; i++) {
            next = (previous + current) % m;
            previous = current;
            current = next;
            if(i==n-2)
                return next;
            if (previous == 0 && current == 1) {
                seq = i+1;
                break;
            }
        }
        rem=n%seq;
        if (rem<=1)
            return rem;
        System.out.println("rem "+rem+" seq "+seq);
        previous =0;
        current =1;
        next=0;
        for ( i = 2; i <=rem; ++i) {
            next = (previous + current)%m;
            previous = current;
            current = next;
        }
        return next%m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHugeNaive(n, m));
    }
}