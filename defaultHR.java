import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int k=0;k<t;k++){
            String[] s=br.readLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int key=Integer.parseInt(s[1]);
            String[] str=br.readLine().split(" ");
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=Integer.parseInt(str[i]);
                     
        }
    }
}
