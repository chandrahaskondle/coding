import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int k=0;k<t;k++){
            int L=0,R=0,T=0,B=0;
            int[] r1=new int[4];
            int[] r2=new int[4];
            String[] s1=br.readLine().split(" ");
            String[] s2=br.readLine().split(" ");    
            for(int i=0;i<4;i++)
                r1[i]=Integer.parseInt(s1[i]);
            for(int i=0;i<4;i++)
                r2[i]=Integer.parseInt(s2[i]);
            int Area=(r1[2]-r1[0])*(r1[3]-r1[1])+(r2[2]-r2[0])*(r2[3]-r2[1]);
    if( (r1[0]<r2[0] && r1[2]<r2[0]) || (r2[2]<r1[0] && r2[2]<r1[2]) || (r1[3]<r2[1] && r1[3]<r2[3]) || (r2[3]<r1[1] && r2[3]<r1[3]) )
                System.out.println(Area);
            else{
                if(r1[0]>r2[0]){
                    L=Math.min(r1[2],r2[0]);
                    R=Math.max(r1[2],r2[0]);    
                }
                else{
                    L=Math.min(r1[0],r2[2]);
                    R=Math.max(r1[0],r2[2]);
                }
                if(r1[1]>r2[1]){
                    B=Math.min(r1[1],r2[3]);
                    T=Math.max(r1[1],r2[3]);    
                }
                else{
                    B=Math.min(r1[3],r2[1]);
                    T=Math.max(r1[3],r2[1]);
                }
                System.out.println(Area-(R-L)*(T-B));
            }
        }
    }
}
