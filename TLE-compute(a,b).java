import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
   
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            long ans=1l;
            int x=1000000007;
            for(int i=0;i<b;i++){
                 ans=(ans*a)%x;
            }
            System.out.println(ans%x);
        }
    }
}
