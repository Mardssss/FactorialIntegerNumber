package org.mardssss;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        checkFac();
}
public static void checkFac(){
    int i,fact=1;
    System.out.println("Write a number to check is factorial!");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt(); // number to calculate the factorial number
    for(i=1;i<=number;i++){
        fact=fact*i;
    }
    System.out.println("Factorial of "+number+" is: "+fact);
    checkFac();
}
}