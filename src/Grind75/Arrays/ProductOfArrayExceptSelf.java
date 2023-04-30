package Grind75.Arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {

        int[] nums ={1,2,3,4}; // [24,12,8,6]
        System.out.println(Arrays.toString(productExceptSelf(nums)));
        System.out.println("--------------------");
        System.out.println(Arrays.toString(productExceptSelfOpti(nums)));

    }

    private static int[] productExceptSelfOpti(int[] nums) {
        int[] result =new int[nums.length];

        int[] prefix =new int[nums.length];
        prefix[0]=1;
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        System.out.println(Arrays.toString(prefix));

        int suffixproduct=1;
        for(int i= nums.length-1;i>=0;i--)
        {
            result[i]=suffixproduct*prefix[i];
            suffixproduct = suffixproduct*nums[i];
        }

        return result;
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result =new int[nums.length];

        int[] prefix =new int[nums.length];
        prefix[0]=1;
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        System.out.println(Arrays.toString(prefix));

        int[] suffix = new int[nums.length];
        suffix[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }
        System.out.println(Arrays.toString(suffix));

        for(int i=0;i<nums.length;i++)
            result[i]=prefix[i]*suffix[i];

        return result;

    }
}
