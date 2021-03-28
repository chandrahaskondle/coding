// return -1, if target not found
// return index, if target found

class Solution {
    public int binarySearch(int[] nums, int target) {
        int i=0,j=nums.length-1;
        
        while(i<=j){
            int m = (i+j)/2;
            if(nums[m]<target)
                i=m+1;
            else if(nums[m]>target)
                j=m-1;
            else
                return m;
        }
        return -1;
    }
}
