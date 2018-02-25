import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferReader(new InputStreamReader(System.in()));
        int n=Integer.parseInt(br.readLine());
        String str=br.readLine().split(" ");
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int k=0;k<n;k++){
            int m=Integer.parseInt(str[i]);
            if(mp.containsKey(m)){
                int temp=mp.get(m);
                mp.put(m,temp+1);
            }
            else
                mp.put(m,1);
        }
        int q=Integer.parseInt(br.readLine());
        for(int i=0;i<q;i++){
            int temp=Integer.parseInt(br.readLine());
            if(mp.get(temp)==null)
                System.out.println("0");
            else
                System.out.println(mp.get(temp));
        }
    }
}
