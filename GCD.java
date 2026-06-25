class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
        }
        int gcd=GreatestCD(min,max);
        return gcd;
    }
    private int GreatestCD(int a,int b){
        return b==0?a:GreatestCD(b,a%b);
    }
}
