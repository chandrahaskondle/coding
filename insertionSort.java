//Implement Insertion Sort and print the index at which the ith element gets inserted [i>=1].

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int i,j,key=0;
        while(T>0){
            int temp=0;
            int N=sc.nextInt();
            int a[]=new int[N];
            for(i=0;i<N;i++)
                a[i]=sc.nextInt();
            for(i=1;i<N;i++){
                j=i-1;
                key=a[i];
                while(j>=0 && a[j]>key){
                    a[j+1]=a[j];
                    j--;
                    }
                a[j+1]=key;
                //System.out.print(j+1+" ");        
            }
            T--;    
            //System.out.println();
        }
    }
}
