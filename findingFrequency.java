import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)throws IOException 
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String []str=br.readLine().split(" ");
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            int x=Integer.parseInt(str[i]);
            if(mp.containsKey(x))
            {
                int z=mp.get(x);
                mp.put(x,z+1);
            }
            else
                mp.put(x,1);
        }
         int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
             int k=Integer.parseInt(br.readLine());
            if(mp.get(k) == null)
             System.out.println(0);   
            else 
                System.out.println((mp.get(k)));
        }
    }
}
