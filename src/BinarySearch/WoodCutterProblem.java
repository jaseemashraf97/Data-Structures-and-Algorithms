package BinarySearch;

import java.util.Scanner;

public class WoodCutterProblem {
    public static long wood(long[] A,long mid)
    {
        long sum=0;
        for (int i=0;i<A.length;i++)
        {
            if (A[i]>=mid)
                sum += A[i]-mid;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long w = in.nextLong();
        long[] A = new long[(int) n];
        long start=0;
        long mid=0;
        long end = 0;
        for (int i=0;i<n;i++)
        {
            A[i] = in.nextLong();
            if (A[i]>end)
                end = A[i];
        }
        while(start<end)
        {
            mid = (start+end)/2;
            long x = wood(A,mid);
            if (x==w || start==mid)
                break;
            else if(x>w)
                start = mid;
            else
                end = mid;
        }
        System.out.println(mid);
    }
}
