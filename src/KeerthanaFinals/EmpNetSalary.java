package KeerthanaFinals;

import java.util.Scanner;

public class EmpNetSalary {

    private int eno;
    private String ename;
    private int age;
    private double basic;

    private double net;
    public static void main(String[] args) {

        EmpNetSalary em1=new EmpNetSalary();
        //EmpNetSalary em2=new EmpNetSalary(2,"Arjun",5,100.0);

        em1.accept();
        em1.calculate();
        em1.print();

    }

    public EmpNetSalary(){
        eno=1;
        ename="Keerthana";
        age=10;
        basic=1000.0;
    }

    public EmpNetSalary(int eno,String ename,int age, double basic){
        this.eno=eno;
        this.ename=ename;
        this.age=age;
        this.basic=basic;
    }

    public void accept(){
        //scanner class
    }

    public void calculate(){

        double hra =basic*(18.5/100);
        double da=basic*(17.45/100);
        double pf=basic*(8.10/100);

        net=basic+hra+da-pf;

        if(age>50){
            net=net+5000;
        }

    }

    public void print(){
        //System.out.println("EmpNo : "+eno+ " Emp Name "+ename+" Age : "+age+" Basic Salary : "+basic+" Net Salary : "+net);

        System.out.println("eno \t ename \t age \t basic \t net");
        System.out.println(eno+"\t"+ename+"\t"+age+"\t"+basic+"\t"+net);
    }

}
