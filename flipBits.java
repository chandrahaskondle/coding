

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++){
        
            int count=0,n=0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            n=a^b;
            for(int i=0;i<32;i++){
                if((n>>i)%2==1){
                    count++;
                }
            }
        System.out.println(count);
        }   
    }
}
