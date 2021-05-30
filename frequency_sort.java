import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static void main(String args[] ) throws Exception {
		Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        int arr[] = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = s.nextInt();
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int i = 0; i<n; i++) {
            if( hmap.containsKey(arr[i]))
                hmap.put(arr[i], hmap.get(arr[i])+1);
            else
                hmap.put(arr[i], 1);
        }
        int nums_size = hmap.size();
        int nums[] = new int[nums_size];
        int freq[] = new int[nums_size];
        int k=0;
        for( Map.Entry<Integer, Integer> entry: hmap.entrySet()){
            nums[k] = entry.getKey();
            freq[k] = entry.getValue();
            k++;
        }
        
        // performing 2d sorting based on frequecy ( selection sort )
        
        for( int i=0; i<nums_size ; i++){
            int maxIndex = i;
            for( int j=i+1; j<nums_size; j++){
                if( freq[maxIndex] < freq[j] )
                    maxIndex = j;
                // if freq same print elements in descending order
                else if( freq[maxIndex] == freq[j] && nums[maxIndex] > nums[j] )
                    maxIndex = j;
            }
            int temp = freq[maxIndex];
            freq[maxIndex] = freq[i];
            freq[i] = temp;

            int temp2 = nums[maxIndex];
            nums[maxIndex] = nums[i];
            nums[i] = temp2;
        } 
      
        // print the elements
        for(int i=0; i<k; i++){
            for(int j=0; j<freq[i];j++)
                System.out.print(nums[i]+ " ");
        }
    }
}
