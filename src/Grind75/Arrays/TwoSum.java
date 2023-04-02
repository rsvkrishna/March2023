package Grind75.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={2,15,11,7};
        System.out.println(Arrays.toString(twoSum(nums,9)));

    }

    public static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> hm=new HashMap<>();
        int n=0;

        for(int i=0;i<nums.length;i++){
            n=target-nums[i];
            if(hm.containsKey(n)) {
                return new int[]{hm.get(n), i};
            }
                hm.put(nums[i],i);
        }
        return new int[]{};
    }
}
