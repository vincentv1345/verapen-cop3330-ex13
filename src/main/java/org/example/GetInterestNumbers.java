package org.example;

import java.util.Scanner;
public class GetInterestNumbers {
    public int getPrincipal(){
        System.out.println("Enter the Principal: ");
        Scanner p = new Scanner(System.in);
        int principal = p.nextInt();
        return principal;
    }
    public double getInterestRate(){
        System.out.println("Enter the interest rate: ");
        Scanner r = new Scanner(System.in);
        double rate = r.nextDouble();
        return rate;
    }
    public int getYears(){
        System.out.println("Please enter the number of years: ");
        Scanner y = new Scanner(System.in);
        int years = y.nextInt();
        return years;
    }
    public int getCompound(){
        System.out.println("What is the number of times the interest is compounded per year? ");
        Scanner c = new Scanner(System.in);
        int compound = c.nextInt();
        return compound;
    }
}
