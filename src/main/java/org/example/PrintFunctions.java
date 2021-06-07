package org.example;

public class PrintFunctions{
    public void printF(){
        CalculateInterest c = new CalculateInterest();
        int principal = c.getPrincipal();
        double interestRate = c.getInterestRate();
        int getYears = c.getYears();
        int getCompound = c.getCompound();
        double calcInterest = c.calcInt(principal, getYears, interestRate, getCompound);
        System.out.println("$" + principal +  " invested at " + interestRate + "% " + "for " + getYears + " years compounded " + getCompound + " times per year is $" + calcInterest);
    }
}

