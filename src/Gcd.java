
import java.util.Scanner;

public class Gcd {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        long x,y, tmp;

        x=s.nextLong();
        y=s.nextLong();

        if(x<y) {
            tmp = x;
            x = y;
            y = tmp;
        }
        while(true)
        {
            tmp=x%y;
            x=y;
            y=tmp;
            if(tmp<=1)
                break;
        }
        System.out.println((tmp==0)?x:tmp);
    }
}
