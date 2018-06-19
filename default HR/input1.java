import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OuputStreamWriter(System.out));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(br.readLine());
        for(int k=0;k<t;k++){
            String str[]=br.readLine().split(" ");
            int n=Integer.parseInt(str[0]);
            int key=Integer.parseInt(str[1]);
            String str2[]=br.readLine().split(" ");
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=Integer.parseInt(str2[i]);
                     
        }
    }
}
