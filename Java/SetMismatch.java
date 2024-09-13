class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] solution = new int[2];
        Set<Integer> set = new HashSet<Integer>();
        int sum = 0;
        int n = nums.length;
        int total = (n * (n + 1)) / 2;

        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])) solution[0] = nums[i];
            sum  += nums[i];
            set.add(nums[i]);
        }

        solution[1] = total - (sum - solution[0]);

        return solution;
    }
}