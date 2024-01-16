package questions;

import java.util.HashMap;

public class Arrays_ques {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans= new int[2];

        HashMap<Integer, Integer> map= new HashMap<>();
        for (int i=0;i<nums.length; i++){
            if (map.containsKey(target-nums[i])){
                ans[1]=i;
                ans[0]=map.get(target-nums[i]);
            }
            map.put(nums[i],i );
        }
        return ans;
    }

    public int maxArea(int[] height) {
        int maxArea= 0;
        int lIdx= 0;
        int rIdx= height.length-1;

        while (lIdx<rIdx){
            int maxHeight = Math.min(height[lIdx], height[rIdx]);
            int curArea= maxHeight * (rIdx-lIdx);
            maxArea= Math.max(curArea,maxArea);
            if (maxHeight==height[lIdx]){
                lIdx++;
            }
            rIdx++;
        }
        return maxArea;
    }

    public int removeElement(int[] nums, int val) {
        int idx=0;
        for (int i=0; i<nums.length;i++){
            if (nums[i] != val){
                nums[idx++]= nums[i];
            }
        }
        return idx;
    }


    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right= nums.length;
        while(left<=right){
            int mid= (left+right)/2;
            if (nums[mid]==target){
                return mid;
            }
            else if (nums[mid]>target) {
                right= mid-1;
            }
            left= mid+1;
        }
        return left;
    }

    
}
