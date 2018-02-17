//Implement Bubble Sort and print the total number of swaps involved to sort the array.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int i,j;
        while(T>0){
            int temp=0;
            int N=sc.nextInt();
            int a[]=new int[N];
            for(i=0;i<N;i++)
                a[i]=sc.nextInt();
            
           
            for(i=0;i<N-1;i++){
                for(j=0;j<N-i-1;j++){
                    if(a[j]>a[j+1]){
                        int t=a[j];
                        a[j]=a[j+1];
                        a[j+1]=t;
                        temp++;
                    }   
                }
                if(temp==0)break;
            }
            
           
            //System.out.println(temp);
            T--;
       }
    }
}
