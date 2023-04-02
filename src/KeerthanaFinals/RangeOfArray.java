package KeerthanaFinals;

public class RangeOfArray {
    public static void main(String[] args) {
        double[] arr={1.0, 2.3, 4.5, 5.2, 1.1};

        double minElement=Double.MAX_VALUE;
        double maxElement=Double.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            double temp=0;

            temp=arr[i];

            minElement=Math.min(minElement,temp);
            maxElement=Math.max(maxElement,temp);

        }

        double range=0;
        range=maxElement-minElement;

        System.out.println("The range of this array is "+range);
    }
}
