class Solution {
    public int countCompleteDayPairs(int[] hours) {
         int i=0,j=0,temp=1;
         int result=0;
         for (i=0;i<hours.length;i++){
            for(j=i+1;j<hours.length;j++){
                temp=hours[i]+hours[j];
                if (temp%24==0){
                    result+=1;
                }
            }
         }
        return result;
    }
}