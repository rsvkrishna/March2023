package Grind75.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums={3,3,4}; //{2,2,1,1,1,2,2} {3,2,3}
        System.out.println(findMajorityElement(nums));
    }

    public static int findMajorityElement(int[] nums){

        int count =0; int ele=0;
        for(int i=0;i< nums.length;i++){
            if(count==0) {
                ele = nums[i];
                count++;
            }
            else if(ele==nums[i])
                count++;
            else
                count--;
        }

        return ele;

    }
}
