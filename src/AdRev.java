import java.util.*;

public class AdRev
{
    private static long maxDotProduct(long[] a, long[] b) {
        //write your code here
        if(a.length <= 0 || b.length <= 0)
            return 0;
        int i;
        //long tmp, max;
        long result = 0;
        Arrays.sort(a);
        Arrays.sort(b);
/*        for (i = 0; i < a.length; i++)
            System.out.println(a[i]);

        for (i = 0; i < a.length; i++)
            System.out.println(b[i]);

        long result = 0, max;
        for (i = 0; i < a.length; i++)
        {
            max=a[i] * b[i];
            for(j=i;j<b.length;j++)
            if(a[i]*b[j]>max)
                max = a[i] * b[j];
            result += max;
        }
*/
        for (i = 0; i < a.length; i++) {
            result += a[i] * b[i];  // Casting one to long to handle large ints
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextLong();
        }
        System.out.println(maxDotProduct(a, b));
    }

    public static class Lcm {

        public static void main(String[] args) {


            // write your code here
            Scanner s = new Scanner(System.in);
            long x, y, a, b, lcm, tmp, gcd;

            x = s.nextLong();
            y = s.nextLong();
            a = x;
            b = y;
            lcm = 1;
            if (x < y) {
                tmp = x;
                x = y;
                y = tmp;
            }
            while (true) {
                tmp = x % y;
                x = y;
                y = tmp;
                if (tmp <= 1) {
                    if (tmp == 0)
                        gcd = x;
                    else
                        gcd = tmp;
                    lcm = (a * b) / gcd;
                    break;
                }
            }
            System.out.println(lcm);
        }
    }
}

