package com.pranav;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number to get it's multiplication table:");
        int number  = scn.nextInt();
        int i=0;
        scn.nextLine();
        while(i < 11){
            System.out.println(number+" X "+ i+" = "+number*i);
            i++;
        }
        scn.close();

    }

}

