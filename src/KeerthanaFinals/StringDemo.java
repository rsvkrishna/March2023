package KeerthanaFinals;

public class StringDemo {
    public static void main(String[] args) {
        /*String s="BEAUTIFUL";
        String v="LUFITUAEB";*/

        String ori="SAI";

        char[] charArray=ori.toCharArray();

        String rev="";
        int vowelsCounter=0;

        for(int i=ori.length()-1;i>=0;i--){
            char temp=ori.charAt(i);
            rev=rev+temp;

            if(temp=='A'||temp=='E'||temp=='I'||temp=='O'||temp=='U'){
                vowelsCounter++;
            }
        }

        System.out.println(rev);

        System.out.println("number of vowels are "+vowelsCounter);

        System.out.println(ori.startsWith("BE"));



    }

}
