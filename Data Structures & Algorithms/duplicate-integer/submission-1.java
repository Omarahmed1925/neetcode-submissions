class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean flag=false;
    Set<Integer> numSet=new HashSet<>();
    for(int num:nums){
        if(numSet.contains(num)){
            flag=true;
        }else
        numSet.add(num);
        
    }
    return flag;  
      }
}
