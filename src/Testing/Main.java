package Testing;

import java.util.ArrayList;
import java.util.List;

import static Grind75.Arrays.CombinationSum.combinationSum;

public class Main {
    public static int counter=0;
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


}