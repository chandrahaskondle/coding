import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int tempArr[]=new int[100000000];
    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int k=0;k<t;k++){
            int K=0,l=0;
            String str1[]=br.readLine().split(" ");
            int n=Integer.parseInt(str1[0]);
            int key=Integer.parseInt(str1[1]);
            String str2[]=br.readLine().split(" ");
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=Integer.parseInt(str2[i]);
            //System.out.println(n+" "+key);
            int temp=n*(n-1)/2;
            
            for(int i=0;i<n;i++)
                for(int j=i+1;j<n;j++)
                    tempArr[K++]=arr[i]+arr[j];
            for(l=0;l<temp;l++){
                if(key==tempArr[l]){
                    System.out.println("True");
                    break;
                }    
            }
            if(l==temp)
                System.out.println("False");
        }
    }
}
