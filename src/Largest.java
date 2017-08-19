import java.util.Scanner;

public class Largest {

    public static void main(String[] args ){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i,max, curr;
        long res,input;
        //int num[] = new int[n];
        String num = new String();
        String l = new String();
        for(i=0;i<n;i++){
            num=num+in.next();
        }
        num.trim();
        input=Long.valueOf(num).longValue();
        for(curr=0,max=0;input<0;input/=10)
            /*if (max < num) {
                max = curr;
                l += max;
            }*/
        System.out.println(l);
    }
}
