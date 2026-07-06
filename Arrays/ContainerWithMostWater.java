class Solution {
    public int maxArea(int[] height) {
       int left = 0;
       int right =  height.length-1;
       int result = 0;
       int k;
       while (left<right){
        k=(Math.min(height[left],height[right])*(right-left));
        result = Math.max(result,k);
        if(height[left]<height[right]){
           left+=1;
        }
        else{
            right-=1;
        }
       }
       return result;
    }
}
