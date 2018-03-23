import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static String largestNumber(String arr[]){
        Arrays.sort(arr,new Comparator<String>(){
            public int compare(String a,String b){
                return (b+a).compareTo(a+b);           
            }
        });
        StringBuilder sb=new StringBuilder();
        for(String s:arr)
            sb.append(s);
        while(sb.charAt(0)=='0'&&sb.length()>1)
            sb.deleteCharAt(0);
        return sb.toString();
    }

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int k=0;k<t;k++){
            int n=Integer.parseInt(br.readLine());
            String str[]=br.readLine().split(" ");
            System.out.println(largestNumber(str));
        }
    }
}
