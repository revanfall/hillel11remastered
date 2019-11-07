package com.company;


public class Equation {
    void countEquation(double a,double b,double c) {
        Double x1 = (double) 0;
        Double x2 = (double) 0;
        double dis = Math.pow(b, 2) - (4 * a * c);
        if (dis > 0) {
            x1 = (-b + Math.sqrt(dis)) / (2 * a);
            x2 = (-b - Math.sqrt(dis)) / (2 * a);
        } else if (dis == 0) {
            x1 = -b / (2 * a);
        } else if (dis < 0) {
            x1 = null;
            x2 = null;
        }
        if (dis == 0) {
            System.out.println(x1);
        } else {
            System.out.println("x1= " + x1 + " x2=" + x2);
        }
    }
}
