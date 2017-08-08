
import java.util.Scanner;

public class LastDigit {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n==0)
            System.out.println(0);
        else if(n==1)
            System.out.println(1);
        else
        {
            long f[] = new long[n+2];

            f[0]=f[1]=1;
            int i;

                for(i=2;i<n+2;i++)
                    f[i]=(f[i-1]+f[i-2])%10;
                System.out.println(f[n-1]);

        }
    }
}
