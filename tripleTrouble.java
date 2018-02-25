import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int k=0;k<t;k++){
            int n=Integer.parseInt(br.readLine());
            String[] str=br.readLine().split(" ");
            HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
            for(int i=0;i<n;i++){
                int t1=Integer.parseInt(str[i]);
                if(mp.containsKey(t1)){
                    int t2=mp.get(t1);
                    mp.put(t1,t2+1);
                }
                else
                    mp.put(t1,1);
            }
            for(int name: mp.keySet()){
                int value=mp.get(name);
                if(value==1)
                    System.out.println(name);
            }
        }
    }
}
