
        class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsKey(target - nums[i])) {
                hashMap.put(nums[i], i);
            }
            else {
                answer[0] = i;
                answer[1] = hashMap.get(target - nums[i]);
				break;
            }
        }
        return answer;
    }
}
    