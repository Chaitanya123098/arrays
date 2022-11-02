class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(target==nums[i]+nums[j]){
                ans[0]=i;
                ans[1]=j;
                
            }
        }
    }
    return ans;
       
}

}
//target = 3 arr[]={1,2,4,5}----> return{1,2}--> 1+2=3