import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int k=0;k<t;k++){
            int w=1,v=0,c=0;
            String str=br.readLine();
            str=str.toLowerCase();
             //System.out.println(str);
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==' '){
                    if((i>0) && (str.charAt(i-1)!=' ') ){
                       // System.out.println(str.charAt(i-1));
                        w++;
                    }
                }
                else{
                    char A=str.charAt(i);
                    if(A=='a'||A=='e'||A=='i'||A=='o'||A=='u')
                        v++;
                    else
                        c++;
                }
            }
            if(str.charAt(str.length()-1)==' ')
                w--;
            System.out.println(w+" "+v+" "+c);
        }
    }
}
