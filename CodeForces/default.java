import java.io.*;
import java.util.*;

class solution{
    static Scanner sc;
    static BufferedWriter bw;
    
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(t-- > 0) {
            int n = sc.nextInt();
            int arr[] = readIntArray(n);
            for(int i: arr){
                max = Math.max(max, i);
                min = Math.min(min, i);
            }
            bw.write();
        }
        bw.flush();
    }
    
    static int[] readIntArray(int n){
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        return arr;
    }
}
