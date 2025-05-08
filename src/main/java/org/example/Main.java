package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        double val=Double.parseDouble("2.0");
        Sqrt sqrt=new Sqrt(val);
        double result=sqrt.calc();
        System.out.println("Sqrt of " + val + " = " + result);
    }
}