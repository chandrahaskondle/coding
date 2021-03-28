// search in rotated sorted array
// return -1, if not found. return index, if found.

class Solution {
    public int search(int[] nums, int target) {
        int l=0, h=nums.length-1;
        while(l<=h){
            int m = (l+h)/2;
          
            if( nums[m] == target )
                return m;
            // left part is sorted
            else if( nums[l] <= nums[m] ){
                // check if target is between low and mid
                if(target >= nums[l] && target <nums[m])
                    h=m-1;
                else
                    l=m+1;        
            }
            else {
                if(target>nums[m] && target<=nums[h])
                    l=m+1;
                else
                    h=m-1;
            }
        }
        return -1;
    }
}
