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
        String s1[]=br.readLine().split(" ");
        int n=Integer.parseInt(s1[0]);
        int key=Integer.parseInt(s1[1]);
        String s2[]=br.readLine().split(" ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(s2[i]);
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(mp.containsKey(arr[i])){
                int temp=mp.get(arr[i]);
                mp.put(arr[i],temp+1);
                }
            else
                mp.put(arr[i],1);         
        }
    }
}
