import java.io.*;
import java.util.*;

public class BinarySearch {

    static int binarySearch(long[] a, long x,int n) {
        int left = 0, right = n-1;
        //write your code here
        int mid;
        while(right>=left)
        {
            mid = Math.round((left+right)/2);

            if(a[mid]==x)
                return mid;

            if (a[mid]<x)
                left=mid+1;
            else if(a[mid]>x)
                right = mid-1;
        }

        return -1;
    }

    public static void main(String[] args) {
        //FastScanner scanner = new FastScanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int n, m;
        n = scanner.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }
        m = scanner.nextInt();
        long[] b = new long[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextLong();
        }
        for (int i = 0; i < m; i++) {
            //replace with the call to binarySearch when implemented
            System.out.print(binarySearch(a,b[i],n)+ " ");
        }
    }

}
