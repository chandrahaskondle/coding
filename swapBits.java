import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++){
        
            long count=0l,n=0;
            int a=sc.nextInt();
            
            
            for(int i=0;i<32;i++){
                if((n>>i)%2==1){
                    if(i%2==0)
                      count+=Math.pow(2,i+1);
                    else
                        count+=Math.pow(2,i-1);
                }
            }
        System.out.println(count);
        }   
    }
}

