public class SortColors {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i ,c1=0,c2=0,c3=0 ;
        for (i=0;i<n;i++){
            if (nums[i]==0){
                c1+=1;
            }
            else if (nums[i]==1){
                c2+=1;
            }
            else{
                c3+=1;
            }
        }
        for (i=0;i<c1;i++){
            nums[i]=0;
        }
        for (i=c1;i<c1+c2;i++){
            nums[i]=1;
        }
        for (i=c1+c2;i<c1+c2+c3;i++){
            nums[i]=2;
        }
     return;
    }
} 

