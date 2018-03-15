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
            String str1[]=br.readLine().split(" ");
            long x1=Long.parseLong(str1[0]);
            long y1=Long.parseLong(str1[1]);
            long x2=Long.parseLong(str1[2]);
            long y2=Long.parseLong(str1[3]);
            String str2[]=br.readLine().split(" ");
            long x3=Long.parseLong(str2[0]);
            long y3=Long.parseLong(str2[1]);
            long x4=Long.parseLong(str2[2]);
            long y4=Long.parseLong(str2[3]);
            long ans=Math.abs((x2-x1))*Math.abs((y2-y1))+Math.abs((x4-x3))*Math.abs((y4-y3));
            long L=Math.max(x1,x3);
            long R=Math.min(x2,x4);
            long B=Math.max(y1,y3);
            long T=Math.min(y2,y4);
            if(R>L && T>B || R<L&&T<B)
                ans-=Math.abs((R-L))*Math.abs((T-B));
            System.out.println(ans);
        }
    }
}
