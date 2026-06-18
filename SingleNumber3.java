class Solution {
    public int[] singleNumber(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            res^=nums[i];
        }
        int diff=res&(-res);
        int a=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&diff)!=0){
                a^=nums[i];
            }
        }
        int b=res^a;
        return new int[]{a,b};  
    }
}
