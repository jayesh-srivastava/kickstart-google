package BikeTour2020;

import java.util.*;
import java.lang.*;
public class Q1
{
    public static boolean isgreater(int a,int b,int c)
    {
        int d1=b-a;
        int d2=b-c;
        if(d1>=1 && d2>=1)
        {
            return true;
        }
        return false;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        int flag=0;
        if(test>=1 && test<=100) {
            int c[] = new int[test];
            for (int x = 0; x <= test - 1; x++) {
                int cp = sc.nextInt();
                int ar[] = new int[cp];
                for (int y = 0; y < cp; y++) {
                    ar[y] = sc.nextInt();
                    if(ar[y]<1 || ar[y]>100)
                    {
                        flag=1;
                    }
                }
                if(flag==0) {
                    for (int y = 0; y < cp; y++) {
                        if (y <= (cp - 3)) {
                            boolean result = isgreater(ar[y], ar[y + 1], ar[y + 2]);
                            if (result) {
                                c[x]++;
                            }
                        }
                    }
                }
                else
                {
                    System.exit(-1);
                }
            }
            for (int x = 0; x <= test - 1; x++) {
                System.out.println("Case #" + (x + 1) + ": " + c[x]);
            }
        }
        else {
            System.exit(-1);
        }
    }
}
