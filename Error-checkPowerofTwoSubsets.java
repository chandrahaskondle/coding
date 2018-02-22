//runtime error

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int k=0;k<t;k++){
            long n=Integer.parseInt(br.readLine());
            int i=0,count=0;
            while(n>0){
                if((n&1)==1)
                    count++;
                n=n>>1;
            }
            if(count==1)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}
