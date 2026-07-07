class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int[] arr = new int[n];
        int i=0,j=0;
        for(i=0;i<n;i++){
            leftSum[0]=0;
            if(i!=0)
            for(j=0;j<i;j++){
                leftSum[i]+=nums[j];
            }
        }
        for(int p=0;p<n;p++){
            rightSum[n-1]=0;
            if(p!=n-1)
            for(int q=n-1;q>p;q--){
                rightSum[p]+=nums[q];
           }
        }
        for(i=0;i<n;i++){
            arr[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
     return arr;
        
    }
}