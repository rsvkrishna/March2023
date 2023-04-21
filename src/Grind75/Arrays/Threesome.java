package Grind75.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Threesome {
    /*  Input: nums = [-1,0,1,2,-1,-4]
        Output: [[-1,-1,2],[-1,0,1]]     */

    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        List<List<Integer>> ans;
        ans = threeSum(arr);
        System.out.println("The triplets are as follows: ");
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // [-4,-1,-1,0,1,2]
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int sum = 0 - nums[i]; // b+c = -a => two sum problem
                int low = i + 1;
                int high = nums.length - 1;
                while (low < high) {
                    if (nums[low] + nums[high] == sum) {

                        res.add(Arrays.asList(nums[i],nums[low],nums[high]));

                        while (low < high && nums[low] == nums[low + 1])
                            low++;
                        while (low < high && nums[high] == nums[high - 1])
                            high--;

                        low++;
                        high--;

                    } else if (nums[low] + nums[high] < sum)
                        low++;
                    else
                        high--;
                }

            }
        }

        return res;
    }
}
