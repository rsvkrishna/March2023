package KeerthanaFinals;

public class OverloadPrint {
    public static void main(String[] args) {
        print();

        System.out.println(print(19683L));

        print(2,'s');print(2,'S');
        print(2,'c');print(2,'C');

    }

    public static void print(){
        int x=1;
        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(x++ + " ");
            }
            System.out.println();
        }
    }

    private static boolean print(long i) {

        long originalNumber=i;
        long sum=0;

        while(i>0){
            long x=i%10;
            sum =sum+x;
            i=i/10;
            //System.out.println(i);
        }

        if((long)Math.pow(sum,3)==originalNumber)
            return true;
        else
            return false;
    }

    private static void print(int a,char ch){
        if(ch=='s' || ch=='S'){
            System.out.println(a*a);
        } else if(ch=='c' || ch=='C'){
            System.out.println(a*a*a);
        }
    }
}
