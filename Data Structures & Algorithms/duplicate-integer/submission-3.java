class Solution {
    public boolean hasDuplicate(int[] nums) {
        int l = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        int l1 = set.size();
        if(l == l1){
            return false;
        }else{
            return true;
        }
        
    }
}