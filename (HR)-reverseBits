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
            long sum=0l;
            int n=sc.nextInt();
            for(int i=0;i<32;i++){
                if((n>>i)%2==1){
                    sum+=Math.pow(2,31-i);
                }
            }
            System.out.println(sum);
        }
    }
}
