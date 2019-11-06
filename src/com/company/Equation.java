package com.company;

import java.util.Scanner;

public class Equation {
    void countEquation(int a,int b,int c){
        double dis=Math.pow(b,2)-(4*a*c);
        System.out.println(dis);
        double x1=(-b+Math.sqrt(dis))/(2*a);
        double x2=(-b-Math.sqrt(dis))/(2*a);
        System.out.println(a+"x1 + "+b+"x2+ "+c+"=0");
        System.out.println("x1= "+x1 +" x2="+x2);
    }
}
