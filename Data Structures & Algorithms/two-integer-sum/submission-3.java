class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int sum =0;
        // int l=0;
        // int r=nums.length-1;
        // while(l<r){
        //     sum = nums[l]+nums[r];
        //     if(sum==target){
        //         return new int[]{l,r};
        //     }else if(sum<target){
        //         l++;
        //     }else{
        //         r--;
        //     }
        // }
        // return new int[]{0};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int sum = target - nums[i];
            if(map.containsKey(sum)){
                return new int[] {map.get(sum),i};
            }

            map.put(nums[i],i);
        }
        return new int[] {};
        
    }
}
