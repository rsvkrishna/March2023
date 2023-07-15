package Grind75.Arrays;

import java.util.Arrays;

public class SortColours {
    public static void main(String[] args) {

        int[] arr={2,0,2,1,1,0};

        sortColors(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void sortColors(int[] nums) {

        int low=0;int high=nums.length-1;int mid=0; int temp;
        while(mid<=high){
            if(nums[mid]==0){
                temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            } else if(nums[mid]==1){
                mid++;
            } else if(nums[mid]==2){
                temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }

    }
}
