package Grind75.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        List<List<Integer>> ans;
        ans = practiceTest(arr);
        System.out.println("The triplets are as follows: ");
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    //-1 -1 2
    //-1 0 1

    private static List<List<Integer>> practiceTest(int[] arr) {
        Arrays.sort(arr); //{-4 -1 -1 0 1 2}
        List<List<Integer>> res=new ArrayList<>();

        for(int i=0;i< arr.length-2;i++){
            if(i==0 || arr[i]!=arr[i-1]){
                int sum=0-arr[i];
                int low =i+1;
                int high =arr.length-1;

                while(low < high){
                    if(arr[low]+arr[high]== sum){
                        res.add(Arrays.asList(arr[i],arr[low],arr[high]));

                        while(low < high && arr[low]==arr[low+1])
                            low++;
                        while(low < high && arr[high]==arr[high-1])
                            high--;

                        low++;
                        high--;

                    }else if(arr[low]+arr[high] < sum)
                        low++;
                    else
                        high--;
                }
            }
        }
        return res;
    }
}









