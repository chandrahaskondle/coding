import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int k=0;k<t;k++){
            long n=Long.parseLong(br.readLine());
            long i=1,r=0;
            while((r=i*(i+1)/2)<n)
			    i++;
            //System.out.println(i);
            long ans=0L;
            ans=(ans+ (long)Math.pow(2,i) % 1000000007 + (long)Math.pow(2,(i-(r-n)-1)) % 1000000007) % 1000000007;
            System.out.println(ans);
        }
    }
}
