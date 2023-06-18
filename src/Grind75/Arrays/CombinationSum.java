package Grind75.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int arr[] = {2,3,6,7};
        int target = 7;
        List < List < Integer >> ls = combinationSum(arr, target);
        System.out.println(ls.isEmpty());
        System.out.println("Combinations are: ");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(candidates);
        backtrackCombinationSum(result,new ArrayList<>(),candidates,target,0);
        return result;
    }

    private static void backtrackCombinationSum(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start) {
        if(remain<0)
            return;
        else if(remain == 0)
            result.add(new ArrayList<>(tempList));
        else{
            for(int i=start;i<candidates.length;i++){
                tempList.add(candidates[i]);
                backtrackCombinationSum(result,tempList,candidates,remain-candidates[i],i);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
