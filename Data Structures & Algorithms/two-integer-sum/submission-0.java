class Solution {
    public int[] twoSum(int[] nums, int target) {
         int ik=0;
    int jk=0;
    for (int i=0;i<nums.length;i++){
        for (int j=i+1; j<nums.length;j++){
            if(nums[i]+nums[j]==target){
             ik=i;
             jk=j;
            }
        }
    }
    return new int[]{ik,jk};
    
    }
}
