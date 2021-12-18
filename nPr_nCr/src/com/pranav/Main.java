package com.pranav;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(factorial(0));
        System.out.println(nCr(12,5));
        System.out.println(nPr(5,3));

    }
    public static int factorial(int num){
        int fact = 1;
        while(num>0){
            fact *= num;
            num--;
        }
        return fact;
    }

    public static int nCr(int n, int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }

    public static int nPr(int n, int p){
        return factorial(n)/(factorial(n-p));
    }

}
