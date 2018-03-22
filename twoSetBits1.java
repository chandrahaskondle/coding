import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static long binarySearch(long i,long n){
        long lo=1,hi=n,mid=0;
        while(lo<hi){
            mid=lo+(hi-lo)/2;    
            if((mid*(mid+1)/2)>=n)
                hi=mid;
            else
                lo=mid+1;
        }
        return lo;
    }
    static long pow(long b){
        long ans=1L,temp=2L;
        while(b>0){
            if((b&1)==1)
                ans=(ans*temp)% 1000000007 ;
            temp=(temp*temp)% 1000000007 ;
            b=b>>1L;
        }
        return ans;
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int k=0;k<t;k++){
            long n=Long.parseLong(br.readLine());
            long i=1,r=0;
            i=binarySearch(i,n);
            //System.out.println(i);
            //i=10;
            r=i*(i+1)/2;
            long ans=0L;
            ans=(pow(i) + pow(i-(r-n)-1)) % 1000000007;
            System.out.println(ans);
        }
    }
}
