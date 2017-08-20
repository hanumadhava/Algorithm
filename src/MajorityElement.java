import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class MajorityElement {
    private static long getMajorityElement(long[] a, int left, int right) {
        if (a.length==1)
            return -1;

        if (left == right)
            return -1;

        if (left + 1 == right)
            return a[left];
        //write your code here
        int count=1,i=0,ind=0;

        while (i<a.length) {
            if (a[ind] == a[i])
                count++;
            else
                count--;
            if (count == 0) {
                ind = i;
                count = 1;
            }
            i++;
        }
        i=0; count=0;
        while (i<a.length)
        {
            if(a[i]==a[ind])
                count++;
            i++;
        }

        if(count > a.length/2)
            return a[ind];

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

        if (getMajorityElement(a,0,a.length) != -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
 }