class Solution {
    public boolean checkPossibility(int[] nums) {
      int count = 0, n = nums.length;
      for(int i = 0; i < n - 1; i ++) {
        if(nums[i] > nums[i + 1]) {
          count ++;
        if(i > 0 && nums[i + 1] < nums[i - 1]) nums[i + 1] = nums[i];
        else nums[i] = nums[i + 1];
        }
      }
      return count <= 1; 
    }
}