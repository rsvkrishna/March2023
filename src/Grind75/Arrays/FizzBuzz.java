package Grind75.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n=3;
       List<String> returnFizzBuzz=fizzBuzz(n);
        System.out.println(returnFizzBuzz);
    }

    private static List<String> fizzBuzz(int n) {
        List<String> result=new ArrayList<>();
        for(int i=1;i<=n;i++) {
            String output ="";
            if (i % 3 == 0)
                output += "Fizz";
            if (i % 5 == 0)
                output += "Buzz";
            if(output=="")
                output = String.valueOf(i);

            result.add(output);

        }

        return result;
    }
}
