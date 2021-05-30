import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static void main(String args[] ) throws Exception {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for( int i=0; i<n ; i++)
            arr[i] = s.nextInt();
        Arrays.sort(arr);
        int tar1 = s.nextInt();
        
        outer: for( int i=0; i<n ; i++ ) {
            int tar2 = tar1 - arr[i];
            int l = 0, m = n-1;
            while(l<m){
                if(l==i)
                    l++;
                else if(m==i)
                    m--;
                else {
                    if( arr[l]+arr[m] < tar2 )
                        l++;
                    else if( arr[l]+arr[m] > tar2 )
                        m--;
                    else{
                        System.out.println(arr[i]+ " " + arr[l] + " "+ arr[m] );
                        break outer;
                    }
                }
            } 
        }
      
    }
}
