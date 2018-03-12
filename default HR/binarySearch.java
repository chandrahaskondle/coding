import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int binarySearch(int[] arr,int lo,int hi,int key){ 
        int mid=0;
        while(lo<hi){
            mid=lo+(hi-lo+1)/2;
            if(arr[mid]<key)
                lo=mid;
            else if(arr[mid]>key)  
                hi=mid-1;
            else
                return mid;
        }
      return lo;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] str=br.readLine().split(" ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(str[i]);
        Arrays.sort(arr);
        int q=Integer.parseInt(br.readLine());
        for(int k=0;k<q;k++){
            int ans=0;
            int key=Integer.parseInt(br.readLine());
        }
    }
}
