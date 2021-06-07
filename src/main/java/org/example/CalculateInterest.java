package org.example;
import java.lang.Math;
public class CalculateInterest extends GetInterestNumbers{
    public double calcInt(double principal, double time, double rate, double compound){
        double percentRate = rate / 100.0;
        double n = percentRate/compound;
        double o = compound*time;
        double Interest = principal * Math.pow((1 + n),o);
        return Math.round(Interest*100.0)/100.0;
    }
    public double totalValue(double a, double b){
        double value = a + b;
        return value;
    }
}
