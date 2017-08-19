import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class MajorityElement {
    private static long getMajorityElement(long[] a) {
        if (a.length==1) {
            return -1;
        }
        //write your code here
        int count=0,i=0;
        long curr, c[a.length];
        c[] = new long[a.length];
        while (i<a.length)
        {
            curr=a[i];
            c[i]=0;
            if(curr==a[i])
                c[i];

            if(count > a.length/2)
                return count;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }
        Arrays.sort(a);

        if (getMajorityElement(a) != -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
 }