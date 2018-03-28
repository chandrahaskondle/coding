import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> B = new ArrayList<Integer>();
        for(int k=0;k<t;k++){
            int n=Integer.parseInt(br.readLine());
            String str[]=br.readLine().split(" ");
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=Integer.parseInt(str[i]);
            Arrays.sort(arr);
            for(int i=1;i<(1<<n);i++){
                int temp=i,j=0;
                B=new ArrayList<Integer>();
                while(temp>0 && j<n)
                {
                    if((temp&1)!=0)
                        B.add(arr[j]);
                    j++;
                    temp=temp>>1;
                }
                A.add(B);
            }
        }
    }
}
