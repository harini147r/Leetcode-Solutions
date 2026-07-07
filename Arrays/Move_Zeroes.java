class Solution {
    public void moveZeroes(int[] nums) {
        int i,temp;
        int n=nums.length;
        int k=0;
        for(i=0;i<n;i++){
            if (nums[i]!=0){
            temp = nums[i];
            nums[i]=nums[k];
            nums[k++]= temp;
            }
        }
        return;
    }
}
