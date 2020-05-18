package Allocation2020;
import java.util.*;
public class Solution
{
    public static int counthouses(int ar[], int budget)
    {
        Arrays.sort(ar);
        int sum=0;
        int count=0;
        for(int x=0;x<ar.length;x++)
        {
            sum+=ar[x];
            if(sum<=budget)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int tt=sc.nextInt();
        int result[]=new int[tt];
        for(int x=0;x<=tt-1;x++)
        {
            int number=sc.nextInt();
            int budget=sc.nextInt();
            int ar[]=new int[number];
            for(int y=0;y<=number-1;y++)
            {
                ar[y]=sc.nextInt();
            }
            result[x]=counthouses(ar, budget);
        }
        for(int x=0;x<=tt-1;x++)
        {
            System.out.println("Case #"+(x+1)+": "+result[x]);
        }
    }
}
