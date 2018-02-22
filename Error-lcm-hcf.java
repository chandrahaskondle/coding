//runtime error

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int k=0;k<t;k++){
            String str[]=br.readLine().split(" ");
            long a[]=new long[2];
            for(int i=0;i<2;i++)
                a[i]=Long.parseLong(str[i]);
            long temp=1;
                temp=gcd(a[0],a[1]);
            long temp2=0;
                temp2=(a[0]*a[1])/temp;
            System.out.print(temp2+" "+temp+"\n");
        }
    }
    static long gcd(long a , long b){
        if(a==0)
            return b;
        else if(b==0)
            return a;
        else if(a==b)
            return a;
        else if(a>b)
            return gcd(a-b,b);
        else
            return gcd(a,b-a);
    }
    
}
