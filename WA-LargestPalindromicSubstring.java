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
            int n=Integer.parseInt(br.readLine());
            char arr[]=new char[n];
            arr=new String(br.readLine()).toCharArray();
            
            int ans=0;
            for(int p=1;p<n-1;p++){
                int i=p-1,j=p+1,c=0;   
                while(i>=0&& j<n && arr[i]==arr[j]){
                    i--;
                    j++;
                    c++;
                }
                ans=Math.max(ans,c);
            }     
            if(ans>0)
                ans=ans*2+1;
            
            int ans1=0;
            for(int p=0;p<n;p++){
                int i=p,j=p+1,c=0;   
                while(i>=0&& j<n && arr[i]==arr[j]){
                    i--;
                    j++;
                    c++;
                }
                ans1=Math.max(ans1,c);
            }     
            if(ans1>0)
                ans1=ans1*2;
            
            System.out.println(Math.max(ans,ans1));
        }
    }
}
