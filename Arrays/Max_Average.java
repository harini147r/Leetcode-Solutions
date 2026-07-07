class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i,j;
        double sum = 0;
        for(i = 0; i <k ; i++)
            sum+=nums[i];
            double max_sum = sum;
            for(j = k; j < nums.length; j++){
                sum=sum-nums[j-k]+nums[j];
                max_sum = Math.max(max_sum,sum);
            }
        return max_sum/k;
    }
}